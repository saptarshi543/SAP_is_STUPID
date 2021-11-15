//working...success...
console.log("we will move all occurences of a certain characters to the back\nwithout breaking the order of the others");
const prompt=require('prompt-sync')();
var w=prompt();
var user=w.split('');
console.log("enter a character to push them to the back");
var target=(prompt()).toString();
var s=0;
var tmp=[];
console.log("starting....");
for(var i=0;i<user.length;i++){
	if(user[i]!=target){
		tmp.push(user[i]);
		s++;
	}
}
console.log("after modifying..",...user);
for(var i2=0;i2<s;i2++){
	tmp.push(target);
}
console.log("final..",...tmp);