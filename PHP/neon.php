<?php 
/*working.....
success....*/
echo "we will check for neon number..\n enter a numbe";
$n=(int)readline();
$copy=($n*$n);
$sum=0;
while ($copy!=0) {
	$digit=$copy%10;
	$sum+=$digit;
	$copy/=10;
}
if ($sum==$n) {
	echo "$n is a neon number";
} else {
	echo "$n is not a neon number";
}
?>