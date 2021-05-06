def price(colors):

	price = 40 + (colors*5)
	price_tax = round(price+price/10)
	print(price_tax)



colors = int(input('number of colors'))


price(colors)
