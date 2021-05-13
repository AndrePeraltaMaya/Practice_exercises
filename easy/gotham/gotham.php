<!DOCTYPE html>
<html>
<head>
	<title>Gotham</title>
</head>
<body>
	<form  method="post">
		<label for="enemys">Number of criminals present at the scene : </label>
		<input type="text"  name="enemys">

		<input type="submit" value="Action" >
	</form>	
	<br>
	<?php

		function fight($enemys){

			if( $enemys == NULL){
				return("");
			}
			
			if($enemys < 5 ){
	            echo("I got this!");
	        }
	        else if($enemys >= 5 && $enemys <= 10){
	            echo("Help me Batman");
	        }
	        else if($enemys > 10){
	            echo("Good Luck out there!");
	        }
	    }

	    $enemys = $_POST["enemys"];

	    fight($enemys);
        

	
	?>

</body>
</html>
		
