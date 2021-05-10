fun cost(colors:Int):Int{
    
	var cost = (40 + 5*colors)
    
    cost += cost/10

    return(cost)
    
}	


fun main(args: Array<String>){
	
    println("Number of colors : ")
    var number_colors = readLine()!!.toInt()
    
    println(cost(number_colors))     
   
  
}
