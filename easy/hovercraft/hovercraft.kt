
fun factory(sales:Int): String{
    
	var cost = 10 * 2000000
	var sales = sales * 3000000
	var insurance = 1000000

	var final_cost = sales - cost - insurance
	
    if(final_cost > 0 ){
        return("Profit")
    }
    else if(final_cost < 0 ){
        return("Loss")
    }
    else if(final_cost == 0){
        return("Broke Even")
        }
    return ("null")   
}



fun main(args: Array<String>){
	    
    println("Number of hovercrafts : ")
    var sales = "5"!!.toInt()
   
	println(factory(sales))
    

}
