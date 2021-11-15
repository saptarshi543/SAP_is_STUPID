//working...for any no. of digits..
//success..
const readline=require('readline').createInterface({
	input: process.stdin,
	output: process.stdout
})
console.log('we will check armstrong for a number of any digits..')
readline.question('enter a number\n',user=>{
	check_armstrong(user);
	readline.close();
})
function check_armstrong(n) {
	let copy=n;
	const len=n.length;
	let digit,result=0;
	while( copy>0){
		digit=copy%10;
		result+=(digit**len);
		copy=parseInt(copy/10);
	}
	if(result==n)
		console.log(`${n} is an armstrong number`);
	else
		console.log(`${n} is not an armstrong number`);
}