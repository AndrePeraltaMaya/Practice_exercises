<!DOCTYPE html>
<html>
<head>
	<title>Cheering</title>
</head>
<body>
	<form  method="post">
		<label for="yards">Number of yards: </label>
		<input type="text"  name="yards">

		<input type="submit" value="Action" >
	</form>	
	<br>
	<?php

		function cheering($yards){
			if ($yards == NULL ){
				return("");
			}

			if ($yards > 10){
				echo "High Five";
		    }
			else if($yards < 1){
				echo "shh";
		    }
		    else{
		    	$ra = "";

				for ($i=0; $i < $yards; $i++) { 
					echo "Ra!";
				}

		    }

		}

	    $yards = $_POST["yards"];

	    cheering($yards);
        
	?>

</body>
</html>
		
