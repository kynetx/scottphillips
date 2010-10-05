class Changekenid < ActiveRecord::Migration
  def self.up
    add_column :apps, :ken_id, :integer
    rename_column :kens, :ken_id, :guid

  end

  def self.down
  end
end
