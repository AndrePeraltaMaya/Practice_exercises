def time(mi_name,n_agents,people):

	names_list = people.split()
	names_list.append(mi_name)
	names_list.sort(key= str.lower) #Ordenamos la lista de manera alfabeticamente

	count = 20
	count2 = 0

	for i in range(len(names_list)):
		if names_list[i] == mi_name:
			break

		count2 += 1
		if count2 == n_agents:
			count += 20
			count2 = 0
	print(count)
		
mi_name = input()
n_agents = int(input())
people = input()

time(mi_name,n_agents,people)
