<?php

$noises = "Rawr Chirp Ssss";
#Lios say 'Grr', Tigers say 'Rawr', Snakes say 'Ssss', and Birds say 'Chirp'.
$noises_list = explode(" ", $noises);

foreach ($noises_list as $noise) {

	switch ($noise) {
		case "Grr":
			echo "Lions ";
			break;
		case "Rawr":
			echo "Tigers " ; 
			break;
		case "Ssss":
			echo "Snakes ";
			break;
		case "Chirp":
			echo "Birds ";
			break;

	}
}

?>
