
def distribution(siblings,popsicles):
	'''returns a string "give away" if multiple sweets can be distributed among a group of children,
	otherwise returns the string "eat them yourself"'''
	
	if popsicles%siblings == 0:
		print("give away")
	else:
		print("eat them yourself")
		
siblings = input("Number of brothers")
popsicles = input("number of sweets")

distribution(siblings,popsicles)
