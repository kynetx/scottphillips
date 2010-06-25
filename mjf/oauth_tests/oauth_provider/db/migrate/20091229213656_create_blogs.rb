class CreateBlogs < ActiveRecord::Migration
  def self.up
    create_table :blogs do |t|
      t.integer :user_id
      t.string :title
      t.text :post
      t.timestamps
    end
  end
  
  def self.down
    drop_table :blogs
  end
end
