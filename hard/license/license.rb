"""
@author	André Peralta
@version 20/05/2021
"""

def minutes_license mi_name,n_agents,names_list

	names_list = names_list.downcase.split(' ')

	names_list << mi_name.downcase

	names_list.sort!

	pos = names_list.index(mi_name.downcase)

	time = ((pos+1).to_f/n_agents).ceil*20

	return time

end

puts "mi name: "
mi_name = gets

puts "Number of agents: "
n_agents = gets.to_i

puts "Name's lists"
names_list = gets

puts minutes_license(mi_name,n_agents,names_list)

