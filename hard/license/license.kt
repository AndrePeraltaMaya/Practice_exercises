fun minutes(mi_name:String,names:String,agents:Int):Int{
    
    //Creamos una lista a partir del string
    var names_list = names.split(" ")
    //Agregamos mi nombre a la lista
    names_list += mi_name
    //Ordenamos la lista
    names_list = names_list.sorted()
    //Obtenemos la posición de mi nombre con la lista ya ordenada
    var posicion = names_list.indexOf(mi_name)
    //Hacemos el pequeno calculo con respecto al número de agentes
    var calculation = (posicion+1/agents)*20;
    
    return(calculation)
}

fun main(args: Array<String>){
	
    println("Mi name : ")
    var mi_name = readLine()
    
	println("Names list : ")
    var names = readLine()
    
	println("Agents : ")
    var agents = readLine()!!.toInt()	
    
    println(minutes(mi_name,names,agents))    
    

}
