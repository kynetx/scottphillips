class CreateDomains < ActiveRecord::Migration
  def self.up
    create_table :domains do |t|
      t.string :name
      t.integer :app_id

      t.timestamps
    end
  end

  def self.down
    drop_table :domains
  end
end
