"""
@author	André Peralta
@version 20/05/2021
"""

def security floor

	money_pos = floor.index('$')
	thief_pos = floor.index('T')

	if money_pos > thief_pos
		
		if floor[thief_pos..money_pos].index('G')
			return "quiet"
		end
	else

		if floor[money_pos..thief_pos].index('G')
			return "quiet"
		end		
	end

	return "ALARM"
end

puts "Map of the floor: "
floor = gets

puts security(floor)

