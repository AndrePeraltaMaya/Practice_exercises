
fun batman(enemys:Int): String{
    
	if(enemys < 5 ){
            return("I got this!");
        }
        else if(enemys >= 5 && enemys <= 10){
            return("Help me Batman");
        }
        else if(enemys > 10){
            return("Good Luck out there!");
        }
        
        return("")
}



fun main(args: Array<String>){
	    
    println("Number of enemies : ")
    var enemies = redLines()!!.toInt()
   
	println(batman(enemies))
    

}
