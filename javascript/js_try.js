console.log("hello");
const readline=require('readline').createInterface({
	input: process.stdin,
	output: process.stdout
})
readline.question('what is your name?',name=>{
	console.log('hello %s',name)
	readline.close();
})
//working....
//success.....but definitely complicated...