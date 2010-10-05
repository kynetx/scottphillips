# This file should contain all the record creation needed to seed the database with its default values.
# The data can then be loaded with the rake db:seed (or created alongside the db with db:setup).
#
# Examples:
#
#   cities = City.create([{ :name => 'Chicago' }, { :name => 'Copenhagen' }])
#   Mayor.create(:name => 'Daley', :city => cities.first)

User.delete_all
Ken.delete_all
App.delete_all
Domain.delete_all

u = User.new
u.login = "ciddennis"
u.save

k = Ken.new
k.guid = Time.now.to_i.to_s
k.save
u.ken = k;
u.save

a = k.apps.create
a.app_name = "a93x7"
a.auth_required = false;
a.save
d = a.domains.create({:name => "google.com"})
d = a.domains.create({:name => "yahoo.com"})
d = a.domains.create({:name => "bing.com"})

a = k.apps.create
a.app_name = "a93x36"
a.auth_required = false;
a.save
d = a.domains.create({:name => "google.com"})
d = a.domains.create({:name => "yahoo.com"})
d = a.domains.create({:name => "bing.com"})

