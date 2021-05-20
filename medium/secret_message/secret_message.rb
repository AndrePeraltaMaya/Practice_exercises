"""
@author	André Peralta
@version 20/05/2021
"""

def secret_message text

	list_letters = ['a','b','c','d','e','f','g','h',
		'i','j','k','l','m','n','o','p','q','r','s',
		't','u','v','w','x','y','z']

	message = ""

	(0...text.length).each do |i|

		if text[i] == " "
			message = message + " "
		else
			
			message = message + list_letters[-list_letters.index(text[i])-1]
		end
		
	end

	return message
end

puts "Text: "
text = gets.downcase

print secret_message(text)
