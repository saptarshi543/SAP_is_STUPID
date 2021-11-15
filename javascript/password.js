//unique password generator
/*working....
success......*/
function random( max,min){//this function is working...
	min=Math.ceil(min);max=Math.floor(max);
	return Math.floor(Math.random()*(max-min)+min)}
function push_in_final( ...toAdd){for (var i=0;i<toAdd.length;i++){final.push(toAdd[i]);}}
var number=['1','2','3','4','5','6','7','8','9','0'];
var special_char=['!','@','#','$','%','&','*'];
var space=[' '];
var letter=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'];
var alpha=['A','B', 'C','D','E','F','G','H','I','J','K','L','M','N', 'O','P','Q','R','S','T','U','V','W','X','Y','Z'];
var final=[];
const prompt=require('prompt-sync')();
var l_min=parseInt(prompt("enter min length of password- "));
var l_max=parseInt(prompt("enter max length of password- "));
var k_special=parseInt(prompt("should it contain special characters?  :1-yes  :2-no "));
var k_num=parseInt(prompt("should it contain numbers? :1-yes  :2-no "));
var k_space=parseInt(prompt("should it contain spaces? :1-yes  :2-no "));
var k_alpha=parseInt(prompt("should it contain alphabets? :1-yes  :2-no "));
var k_letter=parseInt(prompt("should it contain letters? :1-yes  :2-no "));
var final_length=parseInt(final_length);
if(l_max<l_min){console.log("wrong password lengths ..");}
final_length=random(l_max,l_min);
if (l_max==l_min) {final_length=l_max;}
if(k_letter==2 && k_alpha==2 && k_space==2 && k_num==2 && k_special==2){console.log("poor choice selection...");}
if (k_special==1) {push_in_final(...special_char);}
if(k_space==1){push_in_final(...space);}
if (k_num==1){push_in_final(...number);}
if(k_alpha==1){push_in_final(...alpha);}
if(k_letter==1){push_in_final(...letter);}
var final_pass="";
console.log(...final);
for(var e=0;e<=final_length;e++){final_pass+=String((final[random(0,final.length)]));}
console.log(`>>${final_pass}<<`);