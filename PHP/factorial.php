<?php
/*working......
success.....*/
echo "we will find factorial of a number\n";
$n=(int)readline();
$i=$fact=1;
while ($i<=$n) {
	$fact*=$i;
	$i++;
}
echo "factorial of ".$n . " is " . $fact;
?>