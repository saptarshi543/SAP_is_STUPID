<?php
/*working....
success....*/
function write($d,$toWrite){
	$file=fopen($d, "a") or die("error...file already already exists..");
	fwrite($file, $toWrite);
	fclose($file);
}
echo "we will try to write something in a file..\n";
echo "enter file name that u want to create..\n";
$f=readline();
echo "what do u want to write?\n";
$write=readline();
write($f,$write);
?>