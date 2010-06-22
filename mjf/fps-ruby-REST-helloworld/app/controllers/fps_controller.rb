# Copyright 2007 Amazon Technologies, Inc.  Licensed under the Apache License, Version 2.0 (the "License"); 
# you may not use this file except in compliance with the License. You may obtain a copy of the License at:
#
# http://aws.amazon.com/apache2.0
#
# This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
# See the License for the specific language governing permissions and limitations under the License.
class FpsController < ApplicationController
  require 'aws/fps'
  require 'rexml/document'
  require 'time'

  def get_caller_token
    # generate a unique ID for this request
    unique_id = Time.now.to_i.to_s 
    # prepare the REST request hash
    call = { 'Action' => 'InstallPaymentInstruction',
             'PaymentInstruction' => "MyRole == 'Caller' orSay 'Role does not match';",
             'CallerReference' => unique_id,
             'TokenType' => 'Unrestricted' }
    # make the REST call
    @success = false
		@fps_response = AWS::FPS::Query.do(call)
		rexml_doc = REXML::Document.new(@fps_response)
		elements = rexml_doc.root.elements
    @xml_out = pretty_xml(rexml_doc)
		unless elements["Status"].nil?
		  @status = elements["Status"].text
      @request_id = elements["RequestId"].text
  		if @status == "Success"
  		  @success = true
  		  @CallerTokenId = elements["TokenId"].text
  		end
  	end
  end
  
  def get_recipient_token
    @CallerTokenId = params['CallerTokenId']
    # generate a unique ID for this request
    unique_id = Time.now.to_i.to_s 
    # prepare the REST request hash
    call = {'Action' => 'InstallPaymentInstruction',
      			'PaymentInstruction' => "MyRole == 'Recipient' orSay 'Roles do not match';",
      			'CallerReference' => unique_id,
      			'TokenType' => 'Unrestricted' }
    # make the REST call        
		@fps_response = AWS::FPS::Query.do(call)
		rexml_doc = REXML::Document.new(@fps_response)
		elements = rexml_doc.root.elements
    @xml_out = pretty_xml(rexml_doc)
		@status = elements["Status"].text
		@request_id = elements["RequestId"].text
		@success = false
		if @status == "Success"
		  @success = true
		  @RecipientTokenId = elements["TokenId"].text
		end
  end
  
  def get_sender_token
    @CallerTokenId = params['CallerTokenId']
    @RecipientTokenId = params['RecipientTokenId']
  end

  def redirect_cbui
    # generate a unique ID for this request
    unique_id = Time.now.to_i.to_s # you might use some other 128 character string (db unique id...?)

    # params for the Amazon Payments Co-branded Pipeline redirect
		cbui_params = { 'transactionAmount' => params['Amount'],
		                'pipelineName' => 'SingleUse',
  		              'paymentReason' => 'Test Payment',
  		              'callerReference' => 'SenderToken-' + unique_id }

    # params for the return URL - the page that is opened after the token request is processed. 
    return_params = { 'Amount' => params['Amount'],
                      'CallerTokenId' => params['CallerTokenId'],
                      'RecipientTokenId' => params['RecipientTokenId'] }
    return_path = "fps/thankyou" # thank you controller/method
    
    cbui_URL = AWS::FPS::CBUI.make_url(cbui_params, return_params, return_path)
    logger.info(cbui_URL)
    redirect_to(cbui_URL)
  end
  
  def thankyou
    @SenderTokenId = params['tokenID']
    @CallerTokenId = params['CallerTokenId']
    @RecipientTokenId = params['RecipientTokenId']
    @Amount = params['Amount']
    @success = true
  end
  
  def pay
    @CallerTokenId = params['CallerTokenId']
    @RecipientTokenId = params['RecipientTokenId']
    @SenderTokenId = params['SenderTokenId']
    @Amount = params['Amount']

    call = {  'Action' => 'Pay',
          		# tokens
          		'CallerTokenId' => @CallerTokenId,
          		'SenderTokenId' => @SenderTokenId,
          		'RecipientTokenId' => @RecipientTokenId,
		
          		# transactions details ### NOTE: Complex types are sent like this. #####
          		'TransactionAmount.Amount' => @Amount, 
          		'TransactionAmount.CurrencyCode' => 'USD', 
          		'TransactionDate' => Time.now.gmtime.iso8601, # example result: 2007-05-10T13:08:02
          		'ChargeFeeTo' => 'Recipient', #this must match the true/false value from the recipient token
		
          		# references - unique transaction values
          		'CallerReference' => 'Order-' + Time.now.to_i.to_s, # required unique value for each pay call
          		'SenderReference' => 'Test Sender reference string', # optional unique reference for the sender
          		'RecipientReference' => 'Test Recipient reference string' # optional unique reference for the recipient
          }
    # make the REST call        
		@fps_response = AWS::FPS::Query.do(call)
		rexml_doc = REXML::Document.new(@fps_response)
		elements = rexml_doc.root.elements
    @xml_out = pretty_xml(rexml_doc)
		@status = elements["Status"].text
		@request_id = elements["RequestId"].text
		@success = false
		if @status == "Success"
		  @success = true
		  @TransactionId = elements["TransactionResponse"].elements['TransactionId'].text
		end
  end
  
  def get_transaction
     @TransactionId = params['TransactionId']
     call = {  
            'Action' => 'GetTransaction',
            'TransactionId' => @TransactionId 
            }
    # make the REST call        
		@fps_response = AWS::FPS::Query.do(call)
		rexml_doc = REXML::Document.new(@fps_response)
		elements = rexml_doc.root.elements
    @xml_out = pretty_xml(rexml_doc)
		@status = elements["Status"].text
		@request_id = elements["RequestId"].text
		@success = false
		if @status == "Success"
		  @success = true
		end
  end

  
  def index
    redirect_to :action => 'get_caller_token'
  end
  
  private
  
  def pretty_xml(rexml_doc)
  	xml_out = String.new
    rexml_doc.write(xml_out, 1, false,true) 
    xml_out = REXML::Text.new(xml_out,true).to_s
  end
  
end
