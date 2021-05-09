fun alarm(password:String):String{
    
    var pos_thief = password.indexOf('T')    
    var pos_money = password.indexOf('$')
	
    if(pos_thief < pos_money){
		if(password.substring(pos_thief,pos_money).indexOf('G') == -1){
            return("ALARM")
        }
    }else{
        if(password.substring(pos_money,pos_thief).indexOf('G') == -1){
            return("ALARM")
        }
    }
    
	return("quiet")
}

fun main(args: Array<String>){
	
    println("Floor : ")
    var floor = readLine()
    
    println(alarm(floor))      

}
