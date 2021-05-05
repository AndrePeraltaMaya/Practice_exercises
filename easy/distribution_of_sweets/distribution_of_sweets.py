
def distribution(siblings,popsicles):

	if popsicles%siblings == 0:
		print("give away")
	else:
		print("eat them yourself")
		
siblings = input("Number of brothers")
popsicles = input("number of sweets")

distribution(siblings,popsicles)
