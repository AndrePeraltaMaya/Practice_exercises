fun cheering(yards:Int): String{

	if (yards > 10){
		return("High Five")
    }
	else if(yards < 1){
		return("shh")
    }
	var ra = ""
    for (i in 1..yards) {

        ra = ra + "Ra!"
    }
    return(ra)
}

fun main(args: Array<String>){
	
    println("Number of yards : ")
    var yards = readLine()!!.toInt()

   	println(cheering(yards))

}
