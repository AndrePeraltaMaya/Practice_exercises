fun military_time(time:String):String{

	var time_list:List<String>  = time.substring(0,time.length-2).split(':') 
    var time0 = ""

	if (time.substring(time.length-2,time.length) == "PM" && time_list[0] != "12"){
		time0 = (time_list[0].toInt() + 12).toString()
    }
	else{
		if( time_list[0].toInt() < 10){
			time0 = "0" + time0.toString()
        }
		println(time0 + ':' + time_list[1])
		return ""
    }
	println(time0.toString() + ':' + time_list[1])
    return ""
}
fun main(args: Array<String>){
	
    println("Time : ")
    //var time = readLine()
    
    println(military_time("12:15 AM"))     
      
}
