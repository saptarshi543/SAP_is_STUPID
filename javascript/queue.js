//queue...working..success...
const prompt=require('prompt-sync')();
var size=parseInt(prompt('enter capacity- '));
let q=[];
function enqueue(q,x){
	if(q.length==size){console.log("queue full..");}
	else{q.push(x);}}
function dequeue(q){
	if(q.length==0){console.log("queue Empty");}
	else{q.shift();}}
function display(q){if (q.length==0){console.log("queue empty..");}
else{for(var i=0;i<q.length;i++){console.log(q[i]);}}}
function ShowSize(s){console.log(s.length);}

console.log(`original queue\n ${q}`);
while(true){
	console.log("1: add\t 2:remove\t 3: show queue\t 4:show size");
	var tmp=parseInt(prompt());
	if (tmp==1){let a=parseInt(prompt('enter element to add- '));enqueue(q,a);}
	else if (tmp==2){dequeue(q);}
	else if (tmp==3){display(q);}
	else if(tmp==4){ShowSize(q);}
	else{break;}}