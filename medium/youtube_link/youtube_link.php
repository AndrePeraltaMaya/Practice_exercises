<!DOCTYPE html>
<html>
<head>
	<title>Youtube link</title>
</head>
<body>
	<form  method="post">
		<label for="link">Link : </label>
		<input type="text"  name="link">

		<input type="submit" value="Action" >
	</form>
	<br>
	<?php

		function link_recorted($link){

			if ($link == NULL ){
				return("");
			}
			$link_recorted = "";
    
			if(strpos($link, "=") !== false){
		        $link_recorted = substr($link,strpos($link, "=")+1, strlen($link));
		        echo $link_recorted;
		    }
		    else{
		        $link_recorted = substr($link,strpos($link, "e/")+2,strlen($link));
		        echo $link_recorted;
		    }
		}

	    $link = $_POST["link"];

	    link_recorted($link);
        
	?>

</body>
</html>
		
