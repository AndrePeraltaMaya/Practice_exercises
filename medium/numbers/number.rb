"""
@author	André Peralta
@version 20/05/2021
"""

def replace_numbers text

	dict_numbers = {'0'=>'zero','1'=>'one',
		'2'=>'two','3'=>'three',
		'4'=>'four','5'=>'five','6'=>'six',
		'7'=>'seven','8'=>'eight','9'=>'nine'}

	if text.index("10")
		text.gsub! "10", "ten"
	end

	dict_numbers.each{ |key,value|

		if text.index(key)
			text.gsub! key, value
		end
	}
	return text
	
end

puts "Text: "
text = gets

print replace_numbers(text)
