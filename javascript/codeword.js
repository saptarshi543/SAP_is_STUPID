/*working...success...*/
console.log("we will translate code..");
console.log("enter no. of entries...\nenter code");
const prompt=require('prompt-sync')();
let n=parseInt(prompt());
let s=[];
for (var i = 0; i <n; i++) {
	s[i]=String(prompt());
}
const code={
	"greece":"hello",
	"kilo":"abort",
	"23":"latitude",
	"31":"longitude",
	"1":"1",
	"2":"2",
	"3":"3",
	"4":"4",
	"5":"5",
	"6":"6",
	"7":"7",
	"8":"8",
	"9":"9",
	"0":"0",
}

//uncomment to print s array in terminal and see length of dictionary
// console.log(...s);
// console.log(code.length);

const len=s.length-1;
for(var forS=0;forS<=len;forS++){
	let tmp=s[forS];
	if(tmp in code){
		console.log(`...${code[tmp]}`);}
}