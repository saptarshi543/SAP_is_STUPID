console.log("welcome to calculator..");//working....
const n=parseInt(prompt("enter 1st number.."));//success...
const n2=parseInt(prompt("enter 2nd num.."));
console.log("1..sum\n2..subtract\n3..multiply\ndivision..4");
const choice=parseInt(prompt("enter your choice..."));
let v=0;
if (choice==1) {
v=n+n2;
}else{
	if (choice==2){
		v=n-n2;
	}else{
		if(choice==3){
			v=n*n2;
		}else{
			if(choice==4){
				v=n/n2;
			}else{console.log("invalid input...");}
		}
	}
}
console.log(v);