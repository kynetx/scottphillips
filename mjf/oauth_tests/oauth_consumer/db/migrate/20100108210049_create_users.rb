class CreateUsers < ActiveRecord::Migration
  def self.up
    create_table :users do |t|
      t.string :username
      t.timestamps
    end
    User.create! :username => 'mikefarmer'
  end
  
  def self.down
    drop_table :users
  end
end
