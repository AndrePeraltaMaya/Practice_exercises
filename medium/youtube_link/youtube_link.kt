fun link_recorted(link:String):String{
    
    var link_recorted = ""
    
	if(link.indexOf("=") != -1){
        link_recorted = link.substring(link.indexOf("=")+1,link.length)
    }
    else{
        link_recorted = link.substring(link.indexOf("e/")+2,link.length)
    }
    
    return(link_recorted)
}	


fun main(args: Array<String>){
	
    println("Link : ")
    var url = readLine()
  
    println(link(url))     
   
  
}
