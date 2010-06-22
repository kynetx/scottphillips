# Be sure to restart your server when you modify this file.

# Your secret key for verifying cookie session data integrity.
# If you change this key, all old sessions will become invalid!
# Make sure the secret is at least 30 characters and all random, 
# no regular words or you'll be exposed to dictionary attacks.
ActionController::Base.session = {
  :key         => '_twitter_client_session',
  :secret      => 'a8c0f7c74772c2b122858efb0b7449f395baceb3244f4f7274e923a15da5bfd6757afabc762c28938985333fc49e3b8d9758ba56fbc634b82653ab20a0837654'
}

# Use the database for sessions instead of the cookie-based default,
# which shouldn't be used to store highly confidential information
# (create the session table with "rake db:sessions:create")
# ActionController::Base.session_store = :active_record_store
