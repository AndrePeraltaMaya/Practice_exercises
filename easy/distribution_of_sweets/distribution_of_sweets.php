<!DOCTYPE html>
<html>
<head>
	<title>Distribution of sweets</title>
</head>
<body>
	<form  method="post">
		<label for="siblings">Number of siblings: </label>
		<input type="text"  name="siblings">

		<label for="popsicles">Number of popsicles: </label>
		<input type="text"  name="popsicles">

		<input type="submit" value="Action" >
	</form>	
	<br>
	<?php

		function distribution($siblings,$popsicles){
			if ($siblings == NULL || $popsicles == NUll ){
				return("");
			}

			if ($popsicles%$siblings == 0){
				echo "give away";
			}else{
				echo "eat them yourself";
			}

	    }

	    $siblings = $_POST["siblings"];
	    $popsicles = $_POST["popsicles"];

	    distribution($siblings,$popsicles);
        
	?>

</body>
</html>
		
