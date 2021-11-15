<?php
/*working........
success.....*/ 
echo "we will check armstrong for a number of any digits..\n";
$n=(int)readline();
$no_of_digits=strlen((string)abs($n));
 $copy_2=$n;
 $result=0;
 echo "no. of digits- $no_of_digits\n";
 while($copy_2!=0){
    $digit=$copy_2%10;
 	$result+=($digit**$no_of_digits);
 	$copy_2/=10;
 }
if ($result==$n) {
	echo "$n is an armstrong number";
} else {
    echo "$n is not an armstrong number";
}
?>