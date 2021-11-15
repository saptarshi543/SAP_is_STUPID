<?php
function add($final,$toadd){array_merge($final, $value);}
echo "welcome to password generator.. \n";
echo "enter min-length of password \n";
$lMin=(int)readline();
echo "enter max-length of password \n";
$lMax=(int)readline();
echo "do you wish to include...\n";
echo "space :1-yes :2-no\n";
$k_space=(int)readline();
echo "numbers :1-yes :2-no\n";
$k_num=(int)readline();
echo "special characters :1-yes :2-no\n";
$k_special=(int)readline();
echo "letters :1-yes :2-no\n";
$k_letter=(int)readline();
echo "alphabets :1-yes :2-no\n";
$k_alpha=(int)readline();
$final_len=0;
$final_pass="";
$tmp="";
$space=[' '];
$special=['!','@','#','$','%','&','*'];
$num=['1','2','3','4','5','6','7','8','9','0'];
$alpha=['A','B', 'C','D','E','F','G','H','I','J','K','L','M','N', 'O','P','Q','R','S','T','U','V','W','X','Y','Z'];
$letter=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'];
$final=[];
if ($k_space==1) {add($final,$space);}
if($k_num==1){add($final,$num);}
if($k_special==1){add($final,$special);}
if($k_alpha==1){add($final,$alpha);}
if($k_letter==1){add($final,$letter);}
if($lMax<$lMin){exit("wrong length parameters...");}
if (($lMin==$lMax)||($lMax>$lMax)) {$final_len=rand($lMin,$lMax);}
print_r($final);
//for ($i=0; $i < $final_len; $i++){$tmp=$final[rand(0,((count($final))-1))];$final_pass+=$tmp;}
//echo ">> {$final_pass} <<\n";
?>