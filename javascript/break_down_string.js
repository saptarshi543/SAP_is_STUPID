//take a string input and break it down..
console.log("enter your name...");
var len;
const readline=require('readline').createInterface({
	input: process.stdin,
	output: process.stdout
})
readline.question('',name=>{
	len=name.length;
	readline.close();
	for (var i = 0; i < name.length; i++) {
	console.log(name[i]);
}
})
//hmm..working....
//success....but the same problem..the way to take input is DIGUSTING.. 