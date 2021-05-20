"""
@author	André Peralta
@version 20/05/2021
"""

def pigLatin text

	textList = text.split(" ")

	textList.each do |i|

	print i[1..i.length] + i[0] + "ay "
		
	end
end

puts "Text: "
text = gets

pigLatin(text)
