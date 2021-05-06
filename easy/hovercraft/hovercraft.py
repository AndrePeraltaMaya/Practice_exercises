def factory(sales):
	cost = 10 * 2000000
	sales = sales * 3000000
	insurance = 1000000

	final_cost = sales - cost - insurance

	if final_cost > 0:
		print("Profit")
	if final_cost < 0:
		print("Loss")
	if final_cost == 0:
		print("Broke Even")


sales = int(input('number of hovercrafts'))

factory(sales)
