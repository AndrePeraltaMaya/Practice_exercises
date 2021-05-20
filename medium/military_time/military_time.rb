"""
@author	André Peralta
@version 20/05/2021
"""

def military_time time

	time_list = time[0...-2].split(':')

	if time[-2..-1] == "PM" and time_list[0] != "12"
		time_list[0] = time_list[0].to_i + 12
	else
		if time_list[0].to_i < 10
			time_list[0] = '0' + time_list[0]
		end
		print(time_list[0] + ':' + time_list[1])
		return nil
	end

	print(time_list[0].to_s + ':' + time_list[1])
end

puts "Hour: "
time = gets

military_time(time)
