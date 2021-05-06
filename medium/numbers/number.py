text = 'andre 10'

dict_numbers = {'0':'zero','1':'one',
'2':'two','3':'three',
'4':'four','5':'five','6':'six',
'7':'seven','8':'eight','9':'nine'}

text2 = ''

if '10' in text:
	text = text.replace('10','ten')

for i in text:
	if i in dict_numbers:
		text2 = text2 + dict_numbers[i]
	else:
		text2 = text2 + i

print(text2)
