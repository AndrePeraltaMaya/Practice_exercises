<!DOCTYPE html>
<html>
<head>
	<title>Tickets</title>
</head>
<body>
	<form  method="post">
		<label for="points">Number of points : </label>
		<input type="text"  name="points">

		<label for="price">Toy price : </label>
		<input type="text"  name="price">

		<input type="submit" value="Action" >
	</form>	
	<br>
	<?php  
	
		$points = $_POST["points"];
		$price = $_POST["price"];

		if ($points/12 >= $price) {

			echo "Buy it!";
		}else{
			echo "Try again";
		}
	?>

</body>
</html>
