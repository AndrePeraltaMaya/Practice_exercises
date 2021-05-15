<!DOCTYPE html>
<html>
<head>
	<title>Password</title>
</head>
<body>
	<form  method="post">
		<label for="password">Password : </label>
		<input type="text"  name="password">

		<input type="submit" value="Action" >
	</form>
	<br>
	<?php

		function valid_password($password){

			if ($password == NULL ){
				return("");
			}

			$nums = 0;
			$s_characters = 0;
			$special_characters = Array('!', '@', '#', '$', '%', '&', '*');
			if (strlen($password) < 7 ){
				echo "Weak";
				return null;
			}

			for ($i=0; $i < strlen($password); $i++) { 
				if(is_numeric($password[$i])){
					$nums += 1;
				}
				else if(array_search($password[$i],$special_characters) != false){
					$s_characters += 1;

				}
				if($nums == 2 && $s_characters == 2){
					break;
				}

			}
			if($nums == 2 && $s_characters == 2){
				echo "Strong";
			}else{
				echo "Weak";
			}
			
		}

	    $password = $_POST["password"];

	    valid_password($password);




   
	?>

</body>
</html>
		
