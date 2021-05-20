"""
@author	André Peralta
@version 20/05/2021
"""

def noises_hear noises

	noises = noises.split(' ')

	for i in noises

		case i
		when 'Grr'
			print "Lion "

		when 'Rawr'
			print "Tiger "

		when 'Ssss'
			print "Snake "

		when 'Chirp'
			print "Bird "

		end
	end
end


puts "Noises: "
noises = gets

noises_hear(noises)

