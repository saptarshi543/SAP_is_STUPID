<?php
//working... success....
echo "we will find evenpal no.\nenter a no.\n";
$i=(int)readline();
$sum=0;
$copy=$i;
while($copy!=0){
$sum+=($copy%10);
$copy/=10;
}
$rev=0,$copy_2=$i;
while($copy_2!=0){
	$rev=($rev*10)+($copy_2%10);
	$copy_2/=10;
}
if ($rev==$i && $sum%2==0) {
	echo $i." is a evenpal no.";
}
else{echo $i." is not a evenpal no.";}
?>