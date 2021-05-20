<!DOCTYPE html>
<html>
<head>
	<title>Password</title>
</head>
<body>
	<form  method="post">
		<label for="hour">Hours : </label>
		<input type="text"  name="hour">
		<input type="submit" value="Action" >

	</form>
	<br>
	<?php

		function militar_time($hour){

			if ($hour == NULL ){
				return("");
			}

			$time_list =  explode(":", substr($hour, 0, -2));

			if( substr($hour, -2,strlen($hour)) == 'PM' and $time_list[0] != "12"){
				$time_list[0] = $time_list[0] + 12;
			}
			else{
				if( $time_list[0] < 10){
					$time_list[0] = '0'.$time_list[0];
				}
				echo($time_list[0].':'.$time_list[1]);
				return "";
			}

			echo($time_list[0].':'.$time_list[1]);

		}

	    $hour = $_POST["hour"];

	    militar_time($hour);

	?>

</body>
</html>
		
