fun distribution(siblings:Int,brothers:Int):String{
    
    if(popsicles%siblings == 0){
            return("give away")
    }

    return("eat them yourself")
}	


fun main(args: Array<String>){
	
    println("Number of brothers : ")
    var brothers = readLine()!!.toInt()

    println("Number of sweets : ")
    var siblings = readLine()!!.toInt()

   	printl(distribution(siblings,brothers))
  
}
