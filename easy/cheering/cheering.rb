"""
@author	André Peralta
@version 20/05/2021
"""

def cheering yards

	if yards < 1
		print "shh"
	elsif yards >= 1 and yards < 10
		print "Ra!"*yards 
	elsif yards > 10
		print 'High Five'
	end
end

puts "Number of yards: "
yards = gets.to_i

cheering(yards)

