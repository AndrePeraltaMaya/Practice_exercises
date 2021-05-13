<!DOCTYPE html>
<html>
<head>
	<title>Jungle</title>
</head>
<body>
	<form  method="post">
		<label for="noises">noises heard : </label>
		<input type="text"  name="noises">

		<input type="submit" value="Action" >
	</form>	
	<br>
	<?php

	$noises = $_POST["noises"];
	#Lios say 'Grr', Tigers say 'Rawr', Snakes say 'Ssss', and Birds say 'Chirp'.
	$noises_list = explode(" ", $noises);

	foreach ($noises_list as $noise) {

		switch ($noise) {
			case "Grr":
				echo "Lions ";
				break;
			case "Rawr":
				echo "Tigers " ; 
				break;
			case "Ssss":
				echo "Snakes ";
				break;
			case "Chirp":
				echo "Birds ";
				break;

		}
	}

	?>

</body>
</html>
		
