#Modo fácil, saltandome algunas reglas: 

def pigLatin(text):

	word_list = text.split()
	pig_list = []
	for i in word_list:
		pig_list.append(i[1:]+i[0]+'ay')
		
	print(' '.join(pig_list))


text = input()

pigLatin(text
         
#Modo completo, con todas las reglas de PigLatin

def PigLatin(Palabras):#De inglés a PigLatin

	palabras = Palabras.lower().split()

	vocals = ['a','e','i','o','u']
	caracteres = ['.',',','?','!',';']

	resultado = ''


	for palabra in palabras:

		if palabra[0] in vocals:
			''' Todo esto es sólo para las que empiezan en vocal'''

			if palabra[-1] in caracteres:
				cont = 0
				for letra in palabra[::-1]:
					if letra in caracteres:
						cont += 1
					else:
						break
				resultado = resultado + palabra[:-cont] + 'way ' + palabra[-cont:]
			else:

				resultado = resultado + palabra + 'way '

		else:
			''' Todo esto es sólo para las que no empiezan con vocal'''
			cont = 0
			for letra in palabra:

				if letra not in vocals:

					cont += 1
				else:
					break
			
			if palabra[-1] in caracteres: #llamas?
				cont2 = 0
				for letra in palabra[::-1]:
					if letra in caracteres:
						cont2 += 1
					else:
						break
				resultado =  resultado + palabra[cont:-cont2] + palabra[ : cont] + 'ay' + palabra[-cont2:] + ' '
				
			else:
				resultado = resultado + palabra[cont:] + palabra[ : cont]  + 'ay ' + ' '

	return resultado
         
         
def translate_PigLatin(Palabras): #De PigLatin a Inglés
	vocals = ['a','e','i','o','u']
	caracteres = ['.',',','?','!']
	resultado = ''

	palabras = Palabras.lower().split()

	for palabra in palabras:
		if palabra[-1] not in caracteres:

			if palabra[-3:] == 'way' and palabra[0] in vocals:
				resultado = resultado + palabra[:-3] + ' '

			else:
				x = palabra[:-2]
				resultado = resultado + x[-1] + x[:-1] + ' '
		else:
			cont2 = 0
			for letra in palabra[::-1]:
				if letra in caracteres:
					cont2 += 1
				else:
					break
			if palabra[-3-cont2:-cont2] == 'way' and palabra[0] in vocals: #olahay,
				resultado = resultado + palabra[:-3-cont2] + palabra[-cont2:] + ' '

			else:
				x = palabra[:-2-cont2]
				cont = 0
				for letra in x[::-1]:
					if letra not in vocals:
						cont +=1
				resultado = resultado + x[-cont+cont2:] + x[:-cont+cont2] + palabra[-cont2:] + ' '
	return resultado


	

x = PigLatin('go over there') #Ejemplos
print(x)

y = translate_PigLatin(x)
print(y)
         
