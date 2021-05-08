fun main(args: Array<String>){

	println("Number of points: ")
    var points = "500"!!.toInt()
	println("cost of the squirt gun: ")
    var cost = "40"!!.toInt()

    if(points/12 >= cost){
    	println("Buy it!")
    }
    else{
    	println("Try again")
    }


}
