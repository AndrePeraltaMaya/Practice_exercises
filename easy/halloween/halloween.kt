
fun dolar(houses:Int): Int{
    
	return ((2*100)/houses)  
}

fun main(args: Array<String>){
	    
    println("Number of houses : ")
    var houses = readLine()!!.toInt()
   
	println(dolar(houses))
    
}
