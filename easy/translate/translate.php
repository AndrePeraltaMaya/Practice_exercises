<!DOCTYPE html>
<html>
<head>
	<title>Translate</title>
</head>
<body>
	<form  method="post">
		<label for="text">Put the word to translate:</label>
		<input type="text" id="text" name="texto">
		<input type="submit" value="Action" >
	</form>	
	<br>
	<?php  

		$texto = $_POST['texto'];
		echo strrev($texto)
	?>

</body>
</html>
