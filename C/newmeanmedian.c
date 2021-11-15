#include <stdio.h>
#include <string.h>
int main(){
	printf("mean-1\nmedian-2\na variable when mean is given-3\n");
	int n,n1,n2,sum=0,n3,new,fi,n4,v,me,arr[0];
	scanf("%d\n",&n);
    if(n==1){
    	printf("enter the no. of entries\n");
        scanf("%d",&n1);
        for(int r=0;r<n1;r++){
            scanf("%d",&n2);
            sum+=n2;
        }
        printf("the median is...%d\n",(sum/n1) );
    }
    else if(n==2){
    	printf("enter the no. of entries..\n");
        scanf("%d",&n3);
        for(int t=0;t<n3;t++){
        	scanf("%d",&arr[0]);
        }
        if(2%n3!=0){
        	new=n3+1;
        	printf("the median is %d\n",arr[(int)((new/2)+1)] );
        }
        else{
        	fi=(arr[n3/2]+arr[(n3/2)+1]);
        	printf("the median is..%d\n",fi );
        }
    }
    else if(n==3){
      printf("eter the number of entries\nenter the median\n");
      scanf("%d \n%d",&n4,&me);
      int arr[n4-1];
      for(int w=0;w<n4;w++){
      	scanf("%d",&arr[w]);
      }
      v=(me*2)-n4-1;
      printf("the variable is %d\n",v );
    }
    else
    	printf("wrong choice\n");
}