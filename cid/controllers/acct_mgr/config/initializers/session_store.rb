# Be sure to restart your server when you modify this file.

# Your secret key for verifying cookie session data integrity.
# If you change this key, all old sessions will become invalid!
# Make sure the secret is at least 30 characters and all random, 
# no regular words or you'll be exposed to dictionary attacks.
ActionController::Base.session = {
  :key         => '_acct_mgr_session',
  :secret      => '2642048bb4ee641d53a254c254eb79d031c14ed0baa7f1140014194ac81918baf5340282706be33b6a8f2cf74d36cf5ab35931b3b6022afeaec45d7828d53ee8'
}

# Use the database for sessions instead of the cookie-based default,
# which shouldn't be used to store highly confidential information
# (create the session table with "rake db:sessions:create")
# ActionController::Base.session_store = :active_record_store
