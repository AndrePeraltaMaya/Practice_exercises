"""
@author André Peralta
@version 20/05/2021
"""
def deja_vu text
	repetition = ""
	(0...text.length).each{ |i|
		if repetition.index(text[i])
			return "Deja Vu"
	}
	return "Unique"
end
puts "Text: "
text = gets
print deja_vu(text)
