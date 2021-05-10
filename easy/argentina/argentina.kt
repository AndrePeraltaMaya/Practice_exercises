fun buy(pesos:Int,dollars:Int):String{
    
	if(pesos/50 > dollars){
        return("Dollars")
    }

    return("Pesos")
    
}	


fun main(args: Array<String>){
	
    println("Pesos : ")
    //var pesos = readLine()!!.toInt()

    println("Dollars : ")
    //var dollars = readLine()!!.toInt()
    
    println(buy(pesos,dollars))     
   
  
}
