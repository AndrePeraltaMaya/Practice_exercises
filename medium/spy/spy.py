def spy(text):

	text = text[::-1] #Invertimos el codigo
	text_decoded = ''

	for i in text:
		if i.isalpha() or i == ' ':
			text_decoded = text_decoded + i
	print(text_decoded)


text = input()

spy(text)
