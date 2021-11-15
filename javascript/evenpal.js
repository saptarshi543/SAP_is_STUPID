//working...success...
console.log("we will find evenpal no.\n enter a no.");
const prompt=require('prompt-sync')();
var i=parseInt(prompt());
var copy=i,copy2=i;
var rev=0,sum=0;
while(copy!=0){
	sum+=(copy%10);
	copy=parseInt(copy/10);
}
while(copy2!=0){
	rev=(rev*10)+(copy2%10);
	copy2=parseInt(copy2/10);
}
if (rev==i && sum%2==0){
	console.log(`${i} is evenpal no.`);}
else{console.log(`${i} is not a evenpal no.`);
}