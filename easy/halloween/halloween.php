<!DOCTYPE html>
<html>
<head>
	<title>Halloween</title>
</head>
<body>
	<form  method="post">
		<label for="houses">Total number of houses that you visited : </label>
		<input type="text"  name="houses">

		<input type="submit" value="Action" >
	</form>	
	<br>
	<?php

		$houses = $_POST["houses"];
		$percentage = round((2*100)/$houses);

    	echo($percentage)

	
	?>

</body>
</html>
		
