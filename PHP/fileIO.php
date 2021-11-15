<?php
/*working....
success...*/
function openfile($d){
   $file=fopen($d, "r") or die("error.");
   echo fread($file,filesize($d));
   fclose($file);
}
echo "we will try to read a file...\nenter file location";
$loc=readline();
openfile($loc);
?>