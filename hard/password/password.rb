"""
@author	André Peralta
@version 20/05/2021
"""
def is_i? text
	'''
	Usamos expresiones regulares para comprobar 
	si un caracter tipo str podría ser un int
	'''
       !!(text =~ /\A[-+]?[0-9]+\z/)
    end
def password_test password

	n_numbers = 0
	n_characters = 0
	characters = ['!','@','#','$','%','&','*']

	if password.length < 7
		return "Weak"
	end 

	(0...password.length).each do |i|

		if n_numbers >= 2 and n_characters >= 2
			break
		elsif is_i?(password[i])#Podríamos usar un case pero es menos sofisticado
			n_numbers += 1
		elsif characters.index(password[i])
			n_characters += 1
		end
		
	end
	if n_numbers >= 2 and n_characters >= 2
		return "Strong"
	else
		return "Weak"
	end

end

puts "Password: "
password = gets

puts password_test(password)

