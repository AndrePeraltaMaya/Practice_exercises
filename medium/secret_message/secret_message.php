<!DOCTYPE html>
<html>
<head>
	<title>Secret message</title>
</head>
<body>
	<form  method="post">
		<label for="message">Message : </label>
		<input type="text"  name="message">

		<input type="submit" value="Action" >
	</form>
	<br>
	<?php

		function encode($message){

			if ($message == NULL ){
				return("");
			}

			$list_letters = Array('a','b','c','d','e','f','g','h',
				'i','j','k','l','m','n','o','p','q','r','s',
				't','u','v','w','x','y','z');

			$message_encode = "";

			for ($i=0; $i < strlen($message) ; $i++) { 
				if ($message[$i] == " "){
					$message_encode = $message_encode." ";
					continue;
				}
				$message_encode = $message_encode.$list_letters[array_search(strtolower($message[$i]),array_reverse($list_letters))];
			}

			echo $message_encode;

			
			
		}

	    $message = $_POST["message"];

	    encode($message);
        
	?>

</body>
</html>
		
