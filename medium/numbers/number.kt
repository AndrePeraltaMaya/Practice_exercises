fun change(text:String):String{
    
 var dict_numbers = mapOf(Pair("0","zero"),Pair("1","one"),
                      Pair("2","two"),Pair("3","three"),
    Pair("4","four"),Pair("5","five"),Pair("6","six"),
    Pair("7","seven"),Pair("8","eight"),Pair("9","nine"))
 
 	var text_output = text.replace("10","ten")
    
    for((key,value) in dict_numbers){
        if(key in text ){
            text_output = text_output.replace(key,value)
        }
    }
    
    return(text_output)
}	



fun main(args: Array<String>){
	
    println("Text : ")
    var text = readLine()
    
    println(change(text))     
      
}
