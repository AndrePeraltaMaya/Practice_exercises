#Elaborado por André Peralta M.
#Fecha: 06/11/2020
#Juego de la vida de Conway.

class Array2D: #Clase Array2D
	def __init__(self,ren,col):
		self.renglon = ren
		self.columna = col
		self.arreglo =[ [0 for i in range(col)] for i in range(ren)]

	def clear(self,dato):
		self.arreglo =[ [[dato]for i in range(self.columna)] for i in range(self.renglon)]
	def get_row_size(self):
		return self.renglon
	def get_col_size(self):
		return self.columna
	def set_item(self,ren,col,dato):
		self.arreglo[ren][col] = dato
	def get_item(self,ren,col):
		return self.arreglo[ren][col]
	def to_string(self):
		return self.arreglo


class JuegoDeLaVida:

	def __init__(self,rens,cols,generaciones,poblacion):
		self.largo = cols
		self.alto = rens
		self.grid = Array2D(self.alto,self.largo)
		self.generaciones = generaciones

		for i in poblacion:
			self.grid.set_item(i[0],i[1],1)
		

	def imprime_grid(self):
		for r in range(self.grid.get_col_size()):
			for c in range(self.grid.get_row_size()):
				if self.grid.get_item(r,c) == 0:

					print('░░',end='')
				else:
					print('██',end = '')

			print('')
		print('')

	def get_num_rows(self):#Nos da el número de filas	
		return self.alto
	def get_num_cols(self):#Nos da el número de columnas	
		return self.largo
	def set_celula_muerta(self,row,col):#Hace que una celula esté muerta
		self.grid.set_item(row,col,0)	
	def set_celula_viva(self,row,col):#Hace que una celula esté viva
		self.grid.set_item(row,col,1)	

	def get_is_viva(self,row,col):#Regresa true si en un lugar hay una celula viva
		return self.grid.get_item(row,col) == 1

	def get_is_muerta(self,row,col):#Regresa true si en un lugar hay una celula muerta
		return self.grid.get_item(row,col) == 0

	def get_numero_vecinos_vivos(self,row,col): #Nos dice cuantos vecinos vivos tiene una celda
		CONTADOR_VECINOS = 0

		for i in [row-1, row , row+1]:
			for j in [col-1, col , col+1]:
				try:
					if self.grid.get_item(i,j) == 1  and (i,j) != (row,col):
						CONTADOR_VECINOS += 1
				except Exception as e:
					pass
					
		return CONTADOR_VECINOS


	def evolucionar(self): #Esto hace que cambie con cada generación

		for i in range(self.generaciones):

			array = self.grid.to_string()

			self.imprime_grid()

			lista_proximo_vivos = []
			lista_proximo_muertos = []

			for row in range(self.alto):

				for col in range(self.largo):
					if self.get_numero_vecinos_vivos(row,col) == 3:
						lista_proximo_vivos.append((row,col))

					if self.get_numero_vecinos_vivos(row,col) == 2 :
						pass

					if self.get_numero_vecinos_vivos(row,col) < 2 or self.get_numero_vecinos_vivos(row,col) > 3:
						lista_proximo_muertos.append((row,col))
			
			for i in lista_proximo_vivos:
				self.set_celula_viva(i[0],i[1])

			for i in lista_proximo_muertos:
				self.set_celula_muerta(i[0],i[1])


x = JuegoDeLaVida(7,7,7,[(1,2),(2,2),(2,1),(2,3)]) #Ejemplo

x.evolucionar()
