//this file is only for testing small programs in javascript before using them in big projects
//feel free to use it...
/*var my_arr=new Array(23,53,1,23,4,5);
console.log(sort_my_array(my_arr));*/
/*const a=1234;
separate_numbers(a);
function separate_numbers(a){
	// working....
   var copy=a;
	while(copy!=0){
		var digit=copy%10;
		console.log(digit);
		copy=Math.floor(copy/10);
	}
}*/

/*function getNoOfDigits(n){//working...
	var copy=parseInt(n);
	var ans=0;
	while(copy>0){
		copy=Math.floor(copy/10);
		++ans;
	}
		return ans;
}*/

/*function sleep(ms){//this function is working....
	//it works with milliseconds...
	return new Promise(resolve =>setTimeout(resolve,ms));
}*/
/*async function style(){
	for(;;){
		for(var i=0;i<15;i++){
			for(var f=0;f<i;f++){
				console.log("  ");
			}
			console.log("#");
			await sleep(250);
		}
	}
}*/
//style();
/*function sort_my_array(arr){
	//this function is working....
	for(var i =0;i<arr.length;i++){
        for(var j= i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                var swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
    }
return arr;
} */

/*function HexaToDecimal(n){//working...
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
}*/
/*function random( max,min){//working...
	min=Math.ceil(min);
	max=Math.floor(max);
	return Math.floor(Math.random()*(max-min)+min)
}*/
const prompt=require('prompt-sync')();
// var one=parseInt(prompt());
// var two=parseInt(prompt());
//console.log(Math.floor(Math.random()*two));//working...
console.log(HexaToDecimal("7 C E"));