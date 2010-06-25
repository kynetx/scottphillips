# Be sure to restart your server when you modify this file.

# Your secret key for verifying cookie session data integrity.
# If you change this key, all old sessions will become invalid!
# Make sure the secret is at least 30 characters and all random, 
# no regular words or you'll be exposed to dictionary attacks.
ActionController::Base.session = {
  :key         => '_oauth_provider_session',
  :secret      => 'cbc43ca5b8b68aa111060d02cf846705039577c3dba82b1a0fad009d759f926834f439211395c7e7baffde59800deebaac97a47f19f045ad2fdc3e43e33730f6'
}

# Use the database for sessions instead of the cookie-based default,
# which shouldn't be used to store highly confidential information
# (create the session table with "rake db:sessions:create")
# ActionController::Base.session_store = :active_record_store
