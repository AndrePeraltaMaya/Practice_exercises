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

		function pig_latin($message){

			if ($message == NULL ){
				return("");
			}

			$message_list = explode(" ", $message);

			$message_pigLatin = "";

			foreach ($message_list as $i ) {
				$message_pigLatin = $message_pigLatin.substr($i, 1).substr($i, 0,1)."ay ";
			}

			echo $message_pigLatin;

		}

	    $message = $_POST["message"];

	    pig_latin($message);
        
	?>

</body>
</html>
		
