require 'xsd/qname'

# {http://id.acxiom.com/abilitec-postal/1.0}cleanAddress
#   postalInput_1 - PostalInput
class CleanAddress
  attr_accessor :postalInput_1

  def initialize(postalInput_1 = nil)
    @postalInput_1 = postalInput_1
  end
end

# {http://id.acxiom.com/abilitec-postal/1.0}PostalInput
#   addresses - UnparsedAddress
#   options - PostalOptions
class PostalInput
  attr_accessor :addresses
  attr_accessor :options

  def initialize(addresses = [], options = nil)
    @addresses = addresses
    @options = options
  end
end

# {http://id.acxiom.com/abilitec-postal/1.0}UnparsedAddress
#   addressLines - SOAP::SOAPString
#   city - SOAP::SOAPString
#   postalCode - SOAP::SOAPString
#   state - SOAP::SOAPString
#   urbanization - SOAP::SOAPString
class UnparsedAddress
  attr_accessor :addressLines
  attr_accessor :city
  attr_accessor :postalCode
  attr_accessor :state
  attr_accessor :urbanization

  def initialize(addressLines = [], city = nil, postalCode = nil, state = nil, urbanization = nil)
    @addressLines = addressLines
    @city = city
    @postalCode = postalCode
    @state = state
    @urbanization = urbanization
  end
end

# {http://id.acxiom.com/abilitec-postal/1.0}PostalOptions
#   useLACSLink - SOAP::SOAPBoolean
class PostalOptions
  attr_accessor :useLACSLink

  def initialize(useLACSLink = nil)
    @useLACSLink = useLACSLink
  end
end

# {http://id.acxiom.com/abilitec-postal/1.0}cleanAddressResponse
class CleanAddressResponse < ::Array
end

# {http://id.acxiom.com/abilitec-postal/1.0}PostalOutput
#   addressAbility - AddressAbility
#   deliveryPointValidation - DeliveryPointValidation
#   lacsFlag - SOAP::SOAPString
#   lineOfTravel - SOAP::SOAPString
#   parsedAddress - ParsedAddress
class PostalOutput
  attr_accessor :addressAbility
  attr_accessor :deliveryPointValidation
  attr_accessor :lacsFlag
  attr_accessor :lineOfTravel
  attr_accessor :parsedAddress

  def initialize(addressAbility = nil, deliveryPointValidation = nil, lacsFlag = nil, lineOfTravel = nil, parsedAddress = nil)
    @addressAbility = addressAbility
    @deliveryPointValidation = deliveryPointValidation
    @lacsFlag = lacsFlag
    @lineOfTravel = lineOfTravel
    @parsedAddress = parsedAddress
  end
end

# {http://id.acxiom.com/abilitec-postal/1.0}AddressAbility
#   addressNotFound - SOAP::SOAPBoolean
#   aliasMatch - SOAP::SOAPBoolean
#   alternateAddress - SOAP::SOAPString
#   alternateAddressMatch - SOAP::SOAPBoolean
#   carrierRouteId - SOAP::SOAPString
#   cityAbbreviation - SOAP::SOAPString
#   correctedCityAndOrState - SOAP::SOAPBoolean
#   correctedPrimaryAddress - SOAP::SOAPBoolean
#   correctedSecondaryAddress - SOAP::SOAPBoolean
#   countyCode - SOAP::SOAPString
#   deliveryPointBarCode - SOAP::SOAPString
#   earlyWarningSystemMatch - SOAP::SOAPBoolean
#   failureToMatchLastAddressLine - SOAP::SOAPBoolean
#   financeNumber - SOAP::SOAPString
#   mainCity - SOAP::SOAPString
#   mainState - SOAP::SOAPString
#   match - SOAP::SOAPBoolean
#   missingPoBoxNumber - SOAP::SOAPBoolean
#   missingRuralRouteHcBoxNumber - SOAP::SOAPBoolean
#   missingSecondaryNumberInHighrise - SOAP::SOAPBoolean
#   missingStreetNumber - SOAP::SOAPBoolean
#   multipleMatchMissingIncorrectDirection - SOAP::SOAPBoolean
#   multipleMatchMissingIncorrectSuffix - SOAP::SOAPBoolean
#   multipleMatchPrimaryAddressField - SOAP::SOAPBoolean
#   multipleMatchSecondaryAddressField - SOAP::SOAPBoolean
#   noSuchPrimaryNumber - SOAP::SOAPBoolean
#   poBoxNumberNotOnFile - SOAP::SOAPBoolean
#   recordTypeCode - SOAP::SOAPString
#   returnCode - SOAP::SOAPString
#   ruralRouteHcBoxNotOnFile - SOAP::SOAPBoolean
#   secondaryNumberNotFound - SOAP::SOAPBoolean
#   zipCodeChanged - SOAP::SOAPBoolean
class AddressAbility
  attr_accessor :addressNotFound
  attr_accessor :aliasMatch
  attr_accessor :alternateAddress
  attr_accessor :alternateAddressMatch
  attr_accessor :carrierRouteId
  attr_accessor :cityAbbreviation
  attr_accessor :correctedCityAndOrState
  attr_accessor :correctedPrimaryAddress
  attr_accessor :correctedSecondaryAddress
  attr_accessor :countyCode
  attr_accessor :deliveryPointBarCode
  attr_accessor :earlyWarningSystemMatch
  attr_accessor :failureToMatchLastAddressLine
  attr_accessor :financeNumber
  attr_accessor :mainCity
  attr_accessor :mainState
  attr_accessor :match
  attr_accessor :missingPoBoxNumber
  attr_accessor :missingRuralRouteHcBoxNumber
  attr_accessor :missingSecondaryNumberInHighrise
  attr_accessor :missingStreetNumber
  attr_accessor :multipleMatchMissingIncorrectDirection
  attr_accessor :multipleMatchMissingIncorrectSuffix
  attr_accessor :multipleMatchPrimaryAddressField
  attr_accessor :multipleMatchSecondaryAddressField
  attr_accessor :noSuchPrimaryNumber
  attr_accessor :poBoxNumberNotOnFile
  attr_accessor :recordTypeCode
  attr_accessor :returnCode
  attr_accessor :ruralRouteHcBoxNotOnFile
  attr_accessor :secondaryNumberNotFound
  attr_accessor :zipCodeChanged

  def initialize(addressNotFound = nil, aliasMatch = nil, alternateAddress = nil, alternateAddressMatch = nil, carrierRouteId = nil, cityAbbreviation = nil, correctedCityAndOrState = nil, correctedPrimaryAddress = nil, correctedSecondaryAddress = nil, countyCode = nil, deliveryPointBarCode = nil, earlyWarningSystemMatch = nil, failureToMatchLastAddressLine = nil, financeNumber = nil, mainCity = nil, mainState = nil, match = nil, missingPoBoxNumber = nil, missingRuralRouteHcBoxNumber = nil, missingSecondaryNumberInHighrise = nil, missingStreetNumber = nil, multipleMatchMissingIncorrectDirection = nil, multipleMatchMissingIncorrectSuffix = nil, multipleMatchPrimaryAddressField = nil, multipleMatchSecondaryAddressField = nil, noSuchPrimaryNumber = nil, poBoxNumberNotOnFile = nil, recordTypeCode = nil, returnCode = nil, ruralRouteHcBoxNotOnFile = nil, secondaryNumberNotFound = nil, zipCodeChanged = nil)
    @addressNotFound = addressNotFound
    @aliasMatch = aliasMatch
    @alternateAddress = alternateAddress
    @alternateAddressMatch = alternateAddressMatch
    @carrierRouteId = carrierRouteId
    @cityAbbreviation = cityAbbreviation
    @correctedCityAndOrState = correctedCityAndOrState
    @correctedPrimaryAddress = correctedPrimaryAddress
    @correctedSecondaryAddress = correctedSecondaryAddress
    @countyCode = countyCode
    @deliveryPointBarCode = deliveryPointBarCode
    @earlyWarningSystemMatch = earlyWarningSystemMatch
    @failureToMatchLastAddressLine = failureToMatchLastAddressLine
    @financeNumber = financeNumber
    @mainCity = mainCity
    @mainState = mainState
    @match = match
    @missingPoBoxNumber = missingPoBoxNumber
    @missingRuralRouteHcBoxNumber = missingRuralRouteHcBoxNumber
    @missingSecondaryNumberInHighrise = missingSecondaryNumberInHighrise
    @missingStreetNumber = missingStreetNumber
    @multipleMatchMissingIncorrectDirection = multipleMatchMissingIncorrectDirection
    @multipleMatchMissingIncorrectSuffix = multipleMatchMissingIncorrectSuffix
    @multipleMatchPrimaryAddressField = multipleMatchPrimaryAddressField
    @multipleMatchSecondaryAddressField = multipleMatchSecondaryAddressField
    @noSuchPrimaryNumber = noSuchPrimaryNumber
    @poBoxNumberNotOnFile = poBoxNumberNotOnFile
    @recordTypeCode = recordTypeCode
    @returnCode = returnCode
    @ruralRouteHcBoxNotOnFile = ruralRouteHcBoxNotOnFile
    @secondaryNumberNotFound = secondaryNumberNotFound
    @zipCodeChanged = zipCodeChanged
  end
end

# {http://id.acxiom.com/abilitec-postal/1.0}DeliveryPointValidation
#   accurateSource - SOAP::SOAPString
#   addressNotFound - SOAP::SOAPBoolean
#   aliasMatch - SOAP::SOAPBoolean
#   alternateAddressMatch - SOAP::SOAPBoolean
#   commercialMailReceivingAgency - SOAP::SOAPBoolean
#   correctedCityAndOrState - SOAP::SOAPBoolean
#   correctedPrimaryAddress - SOAP::SOAPBoolean
#   correctedSecondaryAddress - SOAP::SOAPBoolean
#   deliverability - SOAP::SOAPString
#   earlyWarningSystemMatch - SOAP::SOAPBoolean
#   failureToMatchLastAddressLine - SOAP::SOAPBoolean
#   match - SOAP::SOAPBoolean
#   missingPoBoxNumber - SOAP::SOAPBoolean
#   missingRuralRouteHcBoxNumber - SOAP::SOAPBoolean
#   missingSecondaryNumber - SOAP::SOAPBoolean
#   missingStreetNumber - SOAP::SOAPBoolean
#   multipleMatchMissingIncorrectDirection - SOAP::SOAPBoolean
#   multipleMatchMissingIncorrectSuffix - SOAP::SOAPBoolean
#   multipleMatchPrimaryAddressField - SOAP::SOAPBoolean
#   multipleMatchSecondaryAddressField - SOAP::SOAPBoolean
#   noSuchPrimaryNumber - SOAP::SOAPBoolean
#   poBoxNumberNotOnFile - SOAP::SOAPBoolean
#   ruralRouteHcBoxNotOnFile - SOAP::SOAPBoolean
#   secondaryNumberNotFound - SOAP::SOAPBoolean
#   streetFrontMatch - SOAP::SOAPBoolean
#   zipCodeChanged - SOAP::SOAPBoolean
class DeliveryPointValidation
  attr_accessor :accurateSource
  attr_accessor :addressNotFound
  attr_accessor :aliasMatch
  attr_accessor :alternateAddressMatch
  attr_accessor :commercialMailReceivingAgency
  attr_accessor :correctedCityAndOrState
  attr_accessor :correctedPrimaryAddress
  attr_accessor :correctedSecondaryAddress
  attr_accessor :deliverability
  attr_accessor :earlyWarningSystemMatch
  attr_accessor :failureToMatchLastAddressLine
  attr_accessor :match
  attr_accessor :missingPoBoxNumber
  attr_accessor :missingRuralRouteHcBoxNumber
  attr_accessor :missingSecondaryNumber
  attr_accessor :missingStreetNumber
  attr_accessor :multipleMatchMissingIncorrectDirection
  attr_accessor :multipleMatchMissingIncorrectSuffix
  attr_accessor :multipleMatchPrimaryAddressField
  attr_accessor :multipleMatchSecondaryAddressField
  attr_accessor :noSuchPrimaryNumber
  attr_accessor :poBoxNumberNotOnFile
  attr_accessor :ruralRouteHcBoxNotOnFile
  attr_accessor :secondaryNumberNotFound
  attr_accessor :streetFrontMatch
  attr_accessor :zipCodeChanged

  def initialize(accurateSource = nil, addressNotFound = nil, aliasMatch = nil, alternateAddressMatch = nil, commercialMailReceivingAgency = nil, correctedCityAndOrState = nil, correctedPrimaryAddress = nil, correctedSecondaryAddress = nil, deliverability = nil, earlyWarningSystemMatch = nil, failureToMatchLastAddressLine = nil, match = nil, missingPoBoxNumber = nil, missingRuralRouteHcBoxNumber = nil, missingSecondaryNumber = nil, missingStreetNumber = nil, multipleMatchMissingIncorrectDirection = nil, multipleMatchMissingIncorrectSuffix = nil, multipleMatchPrimaryAddressField = nil, multipleMatchSecondaryAddressField = nil, noSuchPrimaryNumber = nil, poBoxNumberNotOnFile = nil, ruralRouteHcBoxNotOnFile = nil, secondaryNumberNotFound = nil, streetFrontMatch = nil, zipCodeChanged = nil)
    @accurateSource = accurateSource
    @addressNotFound = addressNotFound
    @aliasMatch = aliasMatch
    @alternateAddressMatch = alternateAddressMatch
    @commercialMailReceivingAgency = commercialMailReceivingAgency
    @correctedCityAndOrState = correctedCityAndOrState
    @correctedPrimaryAddress = correctedPrimaryAddress
    @correctedSecondaryAddress = correctedSecondaryAddress
    @deliverability = deliverability
    @earlyWarningSystemMatch = earlyWarningSystemMatch
    @failureToMatchLastAddressLine = failureToMatchLastAddressLine
    @match = match
    @missingPoBoxNumber = missingPoBoxNumber
    @missingRuralRouteHcBoxNumber = missingRuralRouteHcBoxNumber
    @missingSecondaryNumber = missingSecondaryNumber
    @missingStreetNumber = missingStreetNumber
    @multipleMatchMissingIncorrectDirection = multipleMatchMissingIncorrectDirection
    @multipleMatchMissingIncorrectSuffix = multipleMatchMissingIncorrectSuffix
    @multipleMatchPrimaryAddressField = multipleMatchPrimaryAddressField
    @multipleMatchSecondaryAddressField = multipleMatchSecondaryAddressField
    @noSuchPrimaryNumber = noSuchPrimaryNumber
    @poBoxNumberNotOnFile = poBoxNumberNotOnFile
    @ruralRouteHcBoxNotOnFile = ruralRouteHcBoxNotOnFile
    @secondaryNumberNotFound = secondaryNumberNotFound
    @streetFrontMatch = streetFrontMatch
    @zipCodeChanged = zipCodeChanged
  end
end

# {http://id.acxiom.com/abilitec-postal/1.0}ParsedAddress
#   city - SOAP::SOAPString
#   locality - SOAP::SOAPString
#   postOfficeBox - SOAP::SOAPString
#   postalCode - SOAP::SOAPString
#   state - SOAP::SOAPString
#   streetInfo - StreetInfo
#   unit - SOAP::SOAPString
#   unitDescription - SOAP::SOAPString
class ParsedAddress
  attr_accessor :city
  attr_accessor :locality
  attr_accessor :postOfficeBox
  attr_accessor :postalCode
  attr_accessor :state
  attr_accessor :streetInfo
  attr_accessor :unit
  attr_accessor :unitDescription

  def initialize(city = nil, locality = nil, postOfficeBox = nil, postalCode = nil, state = nil, streetInfo = nil, unit = nil, unitDescription = nil)
    @city = city
    @locality = locality
    @postOfficeBox = postOfficeBox
    @postalCode = postalCode
    @state = state
    @streetInfo = streetInfo
    @unit = unit
    @unitDescription = unitDescription
  end
end

# {http://id.acxiom.com/abilitec-postal/1.0}StreetInfo
#   name - SOAP::SOAPString
#   number - SOAP::SOAPString
#   postDirection - SOAP::SOAPString
#   preDirection - SOAP::SOAPString
#   suffix - SOAP::SOAPString
class StreetInfo
  attr_accessor :name
  attr_accessor :number
  attr_accessor :postDirection
  attr_accessor :preDirection
  attr_accessor :suffix

  def initialize(name = nil, number = nil, postDirection = nil, preDirection = nil, suffix = nil)
    @name = name
    @number = number
    @postDirection = postDirection
    @preDirection = preDirection
    @suffix = suffix
  end
end

# {http://id.acxiom.com/abilitec-postal/1.0}InputLimitException
#   message - SOAP::SOAPString
class InputLimitException < ::StandardError
  attr_accessor :message

  def initialize(message = nil)
    @message = message
  end
end

# {http://id.acxiom.com/abilitec-postal/1.0}InputValidationException
#   message - SOAP::SOAPString
class InputValidationException < ::StandardError
  attr_accessor :message

  def initialize(message = nil)
    @message = message
  end
end

# {http://id.acxiom.com/abilitec-postal/1.0}SystemUnavailableException
#   message - SOAP::SOAPString
class SystemUnavailableException < ::StandardError
  attr_accessor :message

  def initialize(message = nil)
    @message = message
  end
end
