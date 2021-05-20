"""
@author	André Peralta
@version 20/05/2021
"""

def art colors

	cost = 40 + colors*5
	cost += (cost/10.to_f).ceil
end

puts "Number of colors: "
colors = gets.to_i

print art(colors)

