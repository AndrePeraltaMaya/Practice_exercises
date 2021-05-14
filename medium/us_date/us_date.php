<!DOCTYPE html>
<html>
<head>
	<title>Us date</title>
</head>
<body>
	<form  method="post">
		<label for="date">Link : </label>
		<input type="text"  name="date">

		<input type="submit" value="Action" >
	</form>
	<br>
	<?php

		function date_converted($date){

			$months = array('January'=> '1','February'=> '2',
				'March'=> '3',
				'April'=> '4',
				'May'=> '5',
				'June'=> '6',
				'July'=> '7',
				'August'=> '8',
				'September'=> '9',
				'October'=> '10',
				'November'=> '11',
				'December'=> '12');

			if ($date == NULL ){
				return("");
			}

			if (strpos($date,"/") !== false){
				$date_list = explode("/", $date);
				echo $date_list[1]."/".$date_list[0]."/".$date_list[2]."<br>";

			}else{
				$date_list = explode(" ", $date);
			
				echo $date_list[1][0]."/".$months[$date_list[0]]."/".$date_list[2];
			}
			
		}

	    $date = $_POST["date"];

	    date_converted($date);
        
	?>

</body>
</html>
		
