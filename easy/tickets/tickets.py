def Buy_or_not(points,cost):

	ticket = points/12

	if ticket >= cost:
		print("Buy it!")
	else:
		print("Try again")



points = int(input())
cost = int(input())


Buy_or_not(points,cost)
