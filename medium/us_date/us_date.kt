fun date_format(date:String):String{
    
    var date_output:List<String> = mutableListOf()
    
    if("/" in date){
        
        date_output = date.split("/")
        return(date_output[1] + "/" + date_output[0] + "/" + date_output[2])
        
    }else{
        var months = mapOf(Pair("January", "1"),
                           Pair("February", "2"),
                           Pair("March", "3"),
                           Pair("April", "4"),
                           Pair("May", "5"),
                           Pair("June", "6"),
                           Pair("July", "7"),
                           Pair("August", "8"),
                           Pair("September", "9"),
                           Pair("October", "10"),
                           Pair("November", "11"),
                           Pair("December", "12"))
        
        date_output = date.split(" ")
        return(date_output[1].substring(0,date_output[1].length-1) + "/" + months[date_output[0]] + "/" + date_output[2])
    }
}	


fun main(args: Array<String>){
	
    println("Date : ")
    //var date = readLine()
  
    println(date_format("November 19, 2019"))     
   
  
}
