console.log("reverse an array");
let arr=[1,2,3,4,5,6,7,8,9,10,11];
let j=arr.length-1,tmp=0;
for(var i = 0; i<j;i++){
	tmp = arr[i];
	arr[i]=arr[j];
	arr[j]=tmp;
	--j;
}
console.log(...arr);