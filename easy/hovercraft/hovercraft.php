<!DOCTYPE html>
<html>
<head>
	<title>Hovercraft</title>
</head>
<body>
	<form  method="post">
		<label for="sales">Sales this month : </label>
		<input type="text"  name="sales">

		<input type="submit" value="Action" >
	</form>	
	<br>
	<?php

		$sales = $_POST["sales"];
		$insurance = 1000000;
		$cost = 10 * 2000000;
		$sales = $sales * 3000000;

		$final_cost = $sales - $cost - $insurance;

		if( $final_cost > 0){
			echo"Profit";
		}
		else if ($final_cost < 0){
			echo "Loss";
		}
		else if ($final_cost == 0){
			echo "Broke Even";
		}
	
	?>

</body>
</html>
		
