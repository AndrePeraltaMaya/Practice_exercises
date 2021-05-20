"""
@author André Peralta
@version 20/05/2021
"""
def prices pesos,dollars
	if pesos/50 > dollars
		return "Dollars"
	else
		return "Pesos"
	end
end
puts "Cost in pesos: "
pesos = gets.to_i

puts "Cost in dollars: "
dollars = gets.to_i
print prices(pesos,dollars)
