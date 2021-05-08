
fun cakes(fruit:Int): Int{
    //Returns the number of cakes that can be made
	
    var apples = fruit/2
    
    var number_cakes = apples/3 
    
    return(number_cakes)
}



fun main(args: Array<String>){
	    
    println("Number of fruits : ")
    var fruit = redLines()!!.toInt()
   
	println(cakes(fruit))
    

}
