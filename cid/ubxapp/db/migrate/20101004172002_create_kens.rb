class CreateKens < ActiveRecord::Migration
  def self.up
    create_table :kens do |t|
      t.string :ken_id
      t.text :data
      t.integer :user_id

      t.timestamps
    end
  end

  def self.down
    drop_table :kens
  end
end
