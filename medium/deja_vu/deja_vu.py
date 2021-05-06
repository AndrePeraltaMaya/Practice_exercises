def Deja_Vu(text):

	letters = []

	for i in text:
		if i in letters:
			print('Deja Vu')
			break
		else:
			lettersa.append(i)
	print('Unique')


text = input()

Deja_Vu(text)
