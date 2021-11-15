//stack...working...success...
console.log("enter capacity");
const prompt=require('prompt-sync')();
const size=parseInt(prompt());
const s=[];
function add(s,x){if(s.length==size){console.log("stack full..");}
	else{s.push(x);}
}
function remove(s){
if(s.length==0){console.log("empty...");}else{
s.pop();}
}
function show(s){if (s.length==0){console.log("stack empty..");}
	else{for(var i=0;i<s.length;i++){
			console.log(s[i]);
		}}
}
console.log("original stack\n");
console.log(s);
while(true){
	console.log("1: add\t 2:remove\t 3: show stack");
	var tmp=parseInt(prompt());
	if (tmp==1){let a=parseInt(prompt('enter element to add- '));add(s,a);}
	else if (tmp==2){remove(s);}
	else if (tmp==3){show(s);}
	else{break;}
}