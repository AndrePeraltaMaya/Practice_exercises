def military_time(time):

	time_list = time[:-2].split(':')

	if time[-2:] == 'PM' and time_list[0] != '12':
		time_list[0] = int(time_list[0]) + 12
	else:
		if int(time_list[0]) < 10:
			time_list[0] = '0' + time_list[0]
		print(time_list[0] + ':' + time_list[1])
		return None

	print(str(time_list[0]) + ':' + time_list[1])


time = input()

military_time(time)
