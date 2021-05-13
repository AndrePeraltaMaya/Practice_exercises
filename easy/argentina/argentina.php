<!DOCTYPE html>
<html>
<head>
	<title>Art</title>
</head>
<body>
	<form  method="post">
		<label for="pesos">Price in Pesos : </label>
		<input type="text"  name="pesos">

		<label for="dollars">Price in Dollars : </label>
		<input type="text"  name="dollars">

		<input type="submit" value="Action" >
	</form>	
	<br>
	<?php

		function conversion($pesos,$dollars){

			if ($pesos == NULL || $dollars == NULL ){
				return("");
			}

			if($pesos/50 > $dollars){

				echo "Dollars";

			}else{

				echo "Pesos";
			}
		

		}

	    $pesos = $_POST["pesos"];
	    $dollars = $_POST["dollars"];

	    conversion($pesos,$dollars);
        
	?>

</body>
</html>
		
