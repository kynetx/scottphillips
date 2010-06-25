class CreateTokenSyncs < ActiveRecord::Migration
  def self.up
    create_table :token_syncs do |t|
      t.string :peer_name, :callback_url
      t.timestamps
    end
  end

  def self.down
    drop_table :token_syncs
  end
end
