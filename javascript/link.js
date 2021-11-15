//google creates random links without offensive words in it...lets try that out
//working....success....
function random( max,min){//this function is working...
	min=Math.ceil(min);max=Math.floor(max);
	return Math.floor(Math.random()*(max-min)+min)}
function make() {
container=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'];
var f=""
for (var i=0;i<12;i++){
	if(i==3 || i==8){
		f+="-";
	}
	else{f+=container[random(0,container.length)];}
}
return f;
}
console.log("creating a link...");
console.log(make());