cadenaPedidos = input()

listaPedidos = cadenaPedidos.split()

menu = {'Pizza': 6,'Nachos':6,'Cheeseburger':10,'Water':4,'Coke':5}

costoTotal = 0

for i in listaPedidos:
    if menu.get(i) != None:
        costoTotal += menu.get(i)
    else:
        costoTotal += 5

tax = (costoTotal/100)*7

costoTotal += tax

print(costoTotal)
