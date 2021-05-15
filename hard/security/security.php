<!DOCTYPE html>
<html>
<head>
	<title>Password</title>
</head>
<body>
	<form  method="post">
		<label for="floor">Floor : </label>
		<input type="text"  name="floor">

		<input type="submit" value="Action" >
	</form>
	<br>
	<?php

		function alarm($floor){

			if ($floor == NULL ){
				return("");
			}
		    
		    $pos_thief = strpos($floor,'T');
		    $pos_money = strpos($floor,'$');
			
		    if($pos_thief < $pos_money){
				if(strpos(substr($floor, $pos_thief, $pos_money), 'G') == false){  
		            echo "ALARM";
		            return(""); 
		        }
		    }else{
		        if(strpos(substr($floor, $pos_money,$pos_thief), 'G') == false){
		            echo "ALARM";
		            return("");
		        }
		    }
		    
			echo "quiet";
		}

	    $floor = $_POST["floor"];

	    alarm($floor);

	?>

</body>
</html>
		
