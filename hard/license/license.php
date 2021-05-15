<!DOCTYPE html>
<html>
<head>
	<title>Password</title>
</head>
<body>
	<form  method="post">
		<label for="mi_name">Mi name : </label>
		<input type="text"  name="mi_name">
		<br>
		<label for="agents">Number of agents</label>
		<input type="text" name="agents">
		<br>
		<label for="people">Names list</label>
		<input type="text" name="people">
		<br>
		<input type="submit" value="Action" >

	</form>
	<br>
	<?php

		function minutes($mi_name,$agents,$people){

			if ($mi_name == NULL || $agents == NULL || $people == NULL ){
				return("");
			}

			$names_list = explode(" ",$people); 
			array_push ( $names_list , $mi_name );
			sort($names_list, SORT_NATURAL | SORT_FLAG_CASE);

			$count = 20;
			$count2 = 0;

			$posicion = array_search($mi_name,$names_list);

    		$var1= ($posicion+1)/$agents;//2/5 es 2 a menos que use esto
    		$count = ($var1*20)+($var1*20)%20 ;
			echo $count;

		}

	    $mi_name = $_POST["mi_name"];
	    $agents = $_POST["agents"];
	    $people = $_POST["people"];

	    minutes($mi_name,$agents,$people);

	?>

</body>
</html>
		
