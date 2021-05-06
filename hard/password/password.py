def validate(password):

	caracters = ('!', '@', '#', '$', '%', '&', '*')

	cont_number = 0
	cont_caracters = 0

	for i in password:
		if i in caracters:
			cont_caracters += 1
		elif i.isdecimal():
			cont_number += 1


	if cont_number >= 2 and cont_caracters >= 2 and len(password) >= 7:
		print("Strong")
	else:
		print("Weak")



password = input()

validate(password)
