<!DOCTYPE html>
<html>
<head>
	<title>Art</title>
</head>
<body>
	<form  method="post">
		<label for="colors">Number of colors: </label>
		<input type="text"  name="colors">

		<input type="submit" value="Action" >
	</form>	
	<br>
	<?php

		function cost($colors){

			if ($colors == NULL ){
				return("");
			}

			$canvas_brushes = 40;

			$cost = $colors*5 + $canvas_brushes;

			$cost_tax = $cost + $cost/10;

			echo $cost_tax;
		

		}

	    $colors = $_POST["colors"];

	    cost($colors);
        
	?>

</body>
</html>
		
