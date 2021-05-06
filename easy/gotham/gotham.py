def fight(enemys):

	if enemys < 5:
		print("I got this!")
	if enemys >= 5 and enemys < 10:
		print("Help me Batman")
	if enemys > 10:
		print("Good Luck out there!")


enemys = int(input('number of enemys'))

fight(enemys)
