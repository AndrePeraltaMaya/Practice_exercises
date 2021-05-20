"""
@author	André Peralta
@version 20/05/2021
"""
def is_letter? text
	'''
	Usamos expresiones regulares para comprobar si un caracter tipo str podría ser un int
	'''
       !!(text =~ /\A[-+]?[a-z,A-Z]+\z/)
    end


def secret_message code

	code.reverse!

	message = ""

	(0...code.length).each do |i|

		if is_letter?(code[i])
			message = message + code[i]
		end
		if code[i] == " "
			message = message + code[i]
		end
	end

	return message

end

puts "Code: "
code = gets

print secret_message(code)
