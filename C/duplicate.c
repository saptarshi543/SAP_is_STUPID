#include <stdio.h>
//working....
//success.....
int find_duplicate(int ar[], int l);
int main(){
	int n,s;
	printf("enter no. of entries..\n");
	scanf("%d",&n);
	int ori[n-1];
	for(int r=0;r<n;r++){
		scanf("%d",&ori[r]);
	}
    for(int f=0;f<n;++f){
    	for(int j=f+1;j<n;++j){
    		if(ori[f]>ori[j]){
    			s=ori[f];
    			ori[f]=ori[j];
    			ori[j]=s;
    		}
    	}
    }
	find_duplicate(ori,n);
}
int find_duplicate(int ar[],int l){
	int oc=0;
for(int e=0;e<(l-1);e++){
	if (ar[e]==ar[e+1]){
       ++oc;
       printf("%d exists more than once..\n",ar[e] );
	}
}
printf("total occurences %d\n",oc);
}