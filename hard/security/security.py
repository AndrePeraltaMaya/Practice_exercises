def alarm(floor):

	money_pos = floor.find('$')
	thief_pos = floor.find('T')

	if (money_pos - thief_pos) < 0:
		floor = floor[money_pos:thief_pos+1][::-1]
		if floor.find('G') == -1:
			print('ALARM')
		else:
			print('quiet')

	else:
		floor = floor[thief_pos:money_pos+1]
		if floor.find('G') == -1:
			print('ALARM')
		else:
			print('quiet')


floor = input()

alarm(floor)
