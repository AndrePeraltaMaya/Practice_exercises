"""
@author	André Peralta
@version 20/05/2021
"""

def buy n_tickets, price

	n_points = n_tickets/12

	if n_points >= price
		return "Buy it!"
	else
		return "Try again"
	end

end

puts "Number of tickets: "
n_tickets = gets.to_i
puts "Cost of the squirt gun: "
price = gets.to_i

puts buy(n_tickets,price)

