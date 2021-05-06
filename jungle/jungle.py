def animals(noises):

	noises_list = noises.split()
	animal_output = ''
	for i in noises_list:
		if i == "Grr":
			animal_output = animal_output + "Lion "
		elif i == "Rawr":
			animal_output = animal_output + "Tiger "
		elif i == "Ssss":
			animal_output = animal_output + "Snake "
		elif i == "Chirp":
			animal_output = animal_output + "Bird "

	print(animal_output)


noises = input("Noises")

animals(noises)
