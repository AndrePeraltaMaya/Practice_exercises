"""
@author	André Peralta
@version 19/05/2021
"""

def translate text
	return text.reverse
end
puts "Introduce el texto: "
text = gets.chomp

puts translate(text)
