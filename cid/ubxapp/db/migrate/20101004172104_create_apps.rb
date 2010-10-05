class CreateApps < ActiveRecord::Migration
  def self.up
    create_table :apps do |t|
      t.integer :user_id
      t.boolean :auth_required
      t.text :domain_list
      t.string :app_name
      t.timestamps
    end
  end

  def self.down
    drop_table :apps
  end
end
