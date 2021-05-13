<!DOCTYPE html>
<html>
<head>
	<title>Fruit</title>
</head>
<body>
	<form  method="post">
		<label for="fruit">Amount of fruit in the bowl: </label>
		<input type="text"  name="fruit">

		<input type="submit" value="Action" >
	</form>	
	<br>
	<?php

		function pie($fruit){
			if ($fruit == NULL){
				return("");
			}

			$banana = $fruit/2;

			echo(round($banana/3));

	    }
	    
	    $fruit = $_POST["fruit"];

	    pie($fruit);
        
	?>

</body>
</html>
		
