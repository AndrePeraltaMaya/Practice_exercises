
def distribution(siblings,popsicles):
	'''returns a string "give away" if multiple candies can be distributed to a group of children equally,
     otherwise it returns the string "eat them yourself'''
	
	if popsicles%siblings == 0:
		print("give away")
	else:
		print("eat them yourself")
		
siblings = input("Number of brothers")
popsicles = input("number of sweets")

distribution(siblings,popsicles)
