class Chagneappname < ActiveRecord::Migration
  def self.up
    remove_column :kens, :user_id
    add_column :users, :ken_id , :integer
  end

  def self.down
  end
end
