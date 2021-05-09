fun spy(text:String):String{
    
	var message = ""
    
    for(i in text){
        if(i.isLetter() || i == ' '){
            message = message + i
        }
    }
    
    return(message.reversed())
}	


fun main(args: Array<String>){
	
    println("Text : ")
    var text = readLine()
  
    println(spy(text))     
  
}
