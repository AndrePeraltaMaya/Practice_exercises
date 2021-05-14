<!DOCTYPE html>
<html>
<head>
	<title>Spy</title>
</head>
<body>
	<form  method="post">
		<label for="message">Message : </label>
		<input type="text"  name="message">

		<input type="submit" value="Action" >
	</form>
	<br>
	<?php

		function secret_message($message){

			if ($message == NULL ){
				return("");
			}

			$secret_message = "";

			for ($i=0; $i < strlen($message) ; $i++) { 
				if (ctype_alpha($message[$i]) || $message[$i] == " "){

					$secret_message = $secret_message.$message[$i];
				}
			}
			echo strrev($secret_message);
			
		}

	    $message = $_POST["message"];

	    secret_message($message);
        
	?>

</body>
</html>
		
