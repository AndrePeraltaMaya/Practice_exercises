"""
@author	André Peralta
@version 20/05/2021
"""

def help? n_criminals 

	if n_criminals < 5
		return "I got this!"
	elsif n_criminals >= 5 and n_criminals <= 10
		return "Help me Batman"
	elsif n_criminals > 10
		return "Good Luck out there!"
	end

end


puts "Number of criminals: "
n_criminals = gets.to_i

print help?(n_criminals)

