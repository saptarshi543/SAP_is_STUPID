document.write("hello user\n we will open default web browser\n");
const v=parseInt(confirm("do you want to go to default web browser?"));
if(v==true){
	window.open("https://google.com");
}else{
	document.write("staying on the same page..");
}