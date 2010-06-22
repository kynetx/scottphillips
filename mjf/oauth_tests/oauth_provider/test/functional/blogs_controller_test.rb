require 'test_helper'

class BlogsControllerTest < ActionController::TestCase
  def test_index
    get :index
    assert_template 'index'
  end
  
  def test_new
    get :new
    assert_template 'new'
  end
  
  def test_create_invalid
    Blog.any_instance.stubs(:valid?).returns(false)
    post :create
    assert_template 'new'
  end
  
  def test_create_valid
    Blog.any_instance.stubs(:valid?).returns(true)
    post :create
    assert_redirected_to blogs_url
  end
  
  def test_edit
    get :edit, :id => Blog.first
    assert_template 'edit'
  end
  
  def test_update_invalid
    Blog.any_instance.stubs(:valid?).returns(false)
    put :update, :id => Blog.first
    assert_template 'edit'
  end
  
  def test_update_valid
    Blog.any_instance.stubs(:valid?).returns(true)
    put :update, :id => Blog.first
    assert_redirected_to blogs_url
  end
  
  def test_destroy
    blog = Blog.first
    delete :destroy, :id => blog
    assert_redirected_to blogs_url
    assert !Blog.exists?(blog.id)
  end
end
