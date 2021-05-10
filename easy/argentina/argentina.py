def buy(pesos,dollars):

	pesos_dollar = pesos/50

	if pesos_dollar > dollars: 
		print("Dollars")	
	else:
		print("Pesos")


price_dollars = int(input('Price in dollars'))
price_pesos = int(input('Price in pesos'))

buy(price_pesos,price_dollars)
