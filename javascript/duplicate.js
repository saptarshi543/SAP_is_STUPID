//working....
//success.....
console.log("we will find duplicate elements in an array..");
console.log("enter no. of entries...");
const prompt=require('prompt-sync')();
const n=parseInt(prompt());
ori=[];
for (var i = 0; i < n; i++) {
	ori[i]=parseInt(prompt());
}
find_duplicate(ori);
function sort_my_array(arr){//this function is working....
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
}
function find_duplicate(arr){
	var oc=0;
	const len=parseInt((sort_my_array(arr)).length);
	for(var e=0;e<(len-1);e++){
		if (arr[e]==arr[e+1]) {
			++oc;
			console.log(`${arr[e]} exists more than once..`);
		}
	}
	console.log(`total occurences ${oc}`);
}