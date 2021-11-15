/*working...success....*/
//we will be converting numerical values
function getNoOfDigits(n){//working...
	var copy=parseInt(n);
	var ans=0;
	while(copy>0){
		copy=Math.floor(copy/10);
		++ans;
	}
		return ans;}
function OctalToDecimal(n) {//working...
var ans=0;
var copy=parseInt(n);
var dig=getNoOfDigits(n);
for(var i=0;i<(dig+1);i++){
	ans+= ((copy%10)*(8**i))
	copy=Math.floor(copy/10);
}
return ans;
}
function HexaToDecimal(n){//working...
	var ans=0,copy=n,tmp=parseInt(tmp),i2=0;
	const n2=String(n);
	const st=n2.split(" ");
	const st1=st.reverse();
	dict={"A":10,"B":11,"C":12,"D":13,"E":14,"F":15};
	for(var k=0;k<st1.length;k++){
		var i=st1[k];
		if (dict.hasOwnProperty(String(i))){
			tmp=parseInt(dict[i]);}
		else{tmp=parseInt(i);}
		ans= ans+(tmp*(16**i2));
		++i2;}
		return ans;
}
function DecimalToOctal(n){//working...
	var ans="",copy=n;
	while(true){
		ans+=String(copy%8);
		if((copy<=0) || (copy<8)){break;}
		copy=Math.floor(copy/8);
	}
	return [...ans].reverse().join("");
}
function DecimalToHexa(n){//working...
	var ans="",copy=n;
	while(true){
		ans+=String(copy%16);
		if((copy<=0) || (copy<16)){break;}
		copy=Math.floor(copy/16);
	}
	return [...ans].reverse().join("");
}
//driver code...
console.log("welcome to conversion..\n1:Octal to Decimal\n2:Hexadecimal to Decimal\n3:Decimal to Octal\n4:Decimal to Hexadecimal\nany other number to exit");
const prompt=require('prompt-sync')();
var user=parseInt(prompt());
if(user==1){console.log("enter a no.");var d=parseInt(prompt(d));console.log(OctalToDecimal(d));}
		else if(user==2){console.log("enter number or if you want to give characters b/w them \neg: input> 7CE\nenter it as 7 C E");var d=String(prompt());console.log(HexaToDecimal(d));}
		else if(user==3){console.log("enter a no.");var d=parseInt(prompt(d));console.log(DecimalToOctal(d));}
		else if(user==4){console.log("enter a no.");var d=parseInt(prompt(d));console.log(DecimalToHexa(d));}