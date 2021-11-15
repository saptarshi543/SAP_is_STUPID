<?php
/*working......
success.....*/
function find_duplicate($a){
	sort($a);
	$oc=0;
	$actual_length=(count($a))-1;
	for($r=0;$r<$actual_length;$r++){
		if ($a[$r]==$a[$r+1]) {
			++$oc;
			echo $a[$r] . " exists more than once..\n";
		}
	}
	echo "total occurences " . $oc;
}
echo "we will find duplicate no.s in an array\n enter no. of an array\n";
$len_array=(int)readline();
$ori=[];
for ($i=0; $i <$len_array ; $i++){
	echo "enter element..";
	$ori[$i]=((int)readline());
    echo "\n";
}
find_duplicate($ori);
?>