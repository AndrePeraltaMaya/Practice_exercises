fun deja_vu(text:String):String{
    
    var comprobant = ""
	
    for(i in text ){
        if(i in comprobant){
            return("Deja vu")
        }
        else{
            comprobant = comprobant + i
        }
    }
    
	return("Unique")
}

fun main(args: Array<String>){
	
    println("Text : ")
    var text = readLine()
    
    println(deja_vu(text))     
      
}
