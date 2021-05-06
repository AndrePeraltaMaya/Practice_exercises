def buy(pesos,dollars):

	pesos_dollar = pesos/50

	if pesos_dollar > dollars: 
		print("Dollars")	
	else:
		print("Pesos")


price_dollars = int(input('number of enemys'))
price_pesos = int(input('number of enemys'))

buy(price_pesos,price_dollars)
