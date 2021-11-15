//working...but only for 3 digit numbers
//success....
const prompt=require('prompt-sync')();
console.log('we will check if a number is armstrong or not...');
const n=parseInt(prompt('enter a number'));
let copy=n;
let result=0,digit;
while(copy>0){
	digit=copy%10;
	result+=(digit**3);
	copy=parseInt(copy/10);
}
if (n==result) {console.log(`${n} is an armstrong number`);}
else
	console.log(`${n} is not an armstrong number`);