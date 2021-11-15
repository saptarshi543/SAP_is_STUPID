/*working.....
success....*/
const prompt=require('prompt-sync')();
console.log("we will check for neon number..\n enter a number");
const n=parseInt(prompt());
isNEON(n);
function isNEON(a){
	const m=(a*a);
	var copy=m;
	var sum=0;
	var digit=parseInt(digit);
	while(copy!=0){
		digit=copy%10;
		sum+=digit;
		copy=parseInt(copy/10);
	}
	if (sum==a){console.log(`${a} is neon number`);}
	else
		console.log(`${a} is not neon number`);
}