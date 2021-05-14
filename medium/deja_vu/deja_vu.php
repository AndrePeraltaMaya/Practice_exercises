<!DOCTYPE html>
<html>
<head>
	<title>Deja vu</title>
</head>
<body>
	<form  method="post">
		<label for="text">Text : </label>
		<input type="text"  name="text">

		<input type="submit" value="Action" >
	</form>
	<br>
	<?php

		function deja_vu($text){

			if ($text == NULL ){
				return("");
			}

			$str = "";

			for ($i=0; $i < strlen($text) ; $i++) { 

				if (strpos($str, $text[$i])){
					echo "Deja vu";
					return Null;
				}
				else{
					$str = $str.$text[$i];
				}
			}
			echo "Unique";	
			
		}

	    $text = $_POST["text"];

	    deja_vu($text);
        
	?>

</body>
</html>
		
