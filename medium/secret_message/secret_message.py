

def secret(message):

	list_letters = ['a','b','c','d','e','f','g','h',
	'i','j','k','l','m','n','o','p','q','r','s',
	't','u','v','w','x','y','z']

	secret_message = ''

	for i in message:
		if i == ' ':
			secret_message = secret_message + ' '
			continue
			
		secret_message = secret_message + list_letters[::-1][list_letters.index(i.lower())]

	print(secret_message)


message = input()

secret(message)

