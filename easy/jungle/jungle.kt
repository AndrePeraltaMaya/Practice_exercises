fun main(args: Array<String>){

	println("Noises heard: ")
    var noises = "Rawr Chirp Ssss"

    var noisesList = noises.split(" ")

    for(i in noisesList){

	 	when (i) {
		    "Grr" -> {print("Lions ")}
		    "Rawr" ->{print("Tigers ")}
		    "Ssss" -> {print("Snakes ")}
		    "Chirp" -> {print("Birds ")}
		}   	
    }


}
