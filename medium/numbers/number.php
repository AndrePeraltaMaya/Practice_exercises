<!DOCTYPE html>
<html>
<head>
	<title>Numbers</title>
</head>
<body>
	<form  method="post">
		<label for="text">Text : </label>
		<input type="text"  name="text">

		<input type="submit" value="Action" >
	</form>
	<br>
	<?php

		function number_conversion($text){

			if ($text == NULL ){
				return("");
			}

			$dict_numbers = array('0'=>'zero','1'=>'one',
			'2'=>'two','3'=>'three',
			'4'=>'four','5'=>'five','6'=>'six',
			'7'=>'seven','8'=>'eight','9'=>'nine');

			$result = "";

			for ($i=0; $i < strlen($text) ; $i++) { 


				if(array_key_exists($text[$i], $dict_numbers)) {
					
					$result = $result.$dict_numbers[$text[$i]];
				}
				else{

					$result = $result.$text[$i];
				}
			}

			
			echo $result;	
			
		}

	    $text = $_POST["text"];

	    number_conversion($text);
        
	?>

</body>
</html>
		
