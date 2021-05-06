def cheering(yards):

	if yards > 10:
		print("High Five")
	elif yards < 1:
		print("shh")
	else:
		print("Ra!"*yards)


yards = int(input())

cheering(yards)
