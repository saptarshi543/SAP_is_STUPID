/*function sleep(milliseconds){
	return new Promise(resolve=>setTimeout(resolve, milliseconds));
}*/
/*program is working and is also producing zig zag effects but 
i have problems in suspending or pausing the program in middle..*/
 async function lTor() {
	var s="";
	for(var i=0;i<15;i++){
		s+=" ";
		console.log(`${s}#`);
		setTimeout(lTor,10000);
	}
}
async function rTol(){
	var d="               ";
	for(var w=15;w>0;w--){
		var d=d.slice(0,-1);
		console.log(`${d}#`);
		setTimeout(rTol,10000);
	}
}
function main(){
while(true){
	lTor();
	rTol();
}
}
main();