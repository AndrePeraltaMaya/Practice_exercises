fun secret(text:String):String{
    
	var list_letters = mutableListOf('a','b','c','d','e','f','g','h',
	'i','j','k','l','m','n','o','p','q','r','s',
	't','u','v','w','x','y','z')
    
    var secret_message = ""
    
    for(i in text){
        if(i == ' '){
            secret_message = secret_message + " "
        }else{
            secret_message = secret_message + list_letters.reversed()[list_letters.indexOf(i)]
        }
    }
    return(secret_message)
}	


fun main(args: Array<String>){
	
    println("Text : ")
    var text = readLine()
  
    println(secret(text))     
  
}
