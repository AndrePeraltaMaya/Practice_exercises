def pies(fruit):

	number_apples = fruit/2

	number_pies = (number_apples-(number_apples%3))/3

	print(number_pies)



fruit = int(input())

pies(fruit)
