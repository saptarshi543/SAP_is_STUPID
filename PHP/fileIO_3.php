<?php
/*working.....
success......*/
function openFile($d){
	shell_exec($d);
}
echo "lets try to open any file in php..\n";
echo "enter file location...\n";
$loc=readline();
openFile($loc);
?>