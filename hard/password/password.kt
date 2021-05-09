fun validate(password:String):String{
    
    var digits = 0
    var characters = 0
    
	for( i in password){
                
        if(i.isDigit()){
            digits += 1
        }
        else if(!i.isDigit() && !i.isLetter() ){
            characters += 1
        }
        if(digits >= 2 && characters >= 2 && password.length >= 7){
            return("Strong")
        }

    }
    return("Weak")

}

fun main(args: Array<String>){
	
    println("Password : ")
    var password = readLine()
    
    println(validate(password))    

}
