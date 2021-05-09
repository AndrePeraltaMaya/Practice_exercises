fun pig_latin(text:String):String{
    
    var text_list = text.split(" ")
    var text_pig = ""
    for(i in text_list){
        text_pig = text_pig + i.substring(1,i.length) + i.substring(0,1) + "ay "
    }
	 
    return(text_pig)
}	



fun main(args: Array<String>){
	
    println("Text : ")
    var text = readLine()
    
    println(pig_latin(text))     
      
}
