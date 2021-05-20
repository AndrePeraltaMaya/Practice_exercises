"""
@author	André Peralta
@version 20/05/2021
"""

def distribution_of_sweets siblings,popsicles

	if popsicles%siblings == 0
		return "give away"
	else
		return "eat them yourself"
	end
end


puts "Number of siblings: "
siblings = gets.to_i

puts "Number of popsicles: "
popsicles = gets.to_i

print distribution_of_sweets(siblings,popsicles)

