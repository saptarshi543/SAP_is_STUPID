<?php 
//google creates random links without offensive words in it...lets try that out
//working....success.....
function make(){
	$f="";
	$container=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'];
for($i=0;$i<12;$i++){
	if($i==3 || $i==8){$f=sprintf("%s%s",$f,"-");}
	else{$f = $f . $container[rand(0,sizeof($container)-1)];}
}
return $f;
}
echo "we will create link\n";
echo make();
?>