<?php
// working...success
function check_automorphic(int $n):int{
    $copy=$n;
    $sq=($n*$n);
    while(floor($copy)){
        if (($copy%10)!=($sq%10)){return 0;}
        $copy=$copy/10;
        $sq=$sq/10;
    }
    return 1;
}
echo "enter a number to check for automorphic number\n";
$user=(int)readline();
$var=((check_automorphic($user)==1)?"TRUE":"FALSE");
echo ">>".$var;
?>