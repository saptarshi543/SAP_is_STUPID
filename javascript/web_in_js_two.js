//working....
//success....
console.log("hello\n we will search something in the web\n enter search terms");
const readline=require('readline').createInterface({
	input: process.stdin,
	output: process.stdout
})
readline.question('',search_terms=>{
	var f="https://www.google.com/search?q=";
	var d=search_for_space(search_terms);
	var pl=f.concat(d);
	const open=require('open');
	open(pl);
})
function search_for_space(search_terms) {
	var s;
if((search_terms.match(/ /g))!=null){
     s=search_terms.replace(/ /g, "+");
	return s;
}
else{return search_terms;}
}