<?php  
//working....
//but i dont know why its not running in my machine...but i have php already downloaded... 
$user=[];
echo "enter no. of entries...";
$num=(int)readline();
for($i=0;$i<$num;$i++){array_push($user,((int)readline()));}
$sum=0;
foreach ($user as $key=>$value) {$sum+=$value;}
echo "sum=".$sum;
?>