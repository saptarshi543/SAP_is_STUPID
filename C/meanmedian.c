#include <stdio.h>
int main(){
	printf("mean__1\nmedian__2\na variable when mean is given__3\n");
    int wh,entries,sum=0,med,new,fin,sum2=0,il3,ent,mea,arr[0],il;
	scanf("%d\n",&wh);
	switch(wh)
	{
	case 1:
		scanf("enter the number of entries%d\n",&entries);
		for (int i = 0; i < entries; i++){
			scanf("enter the data...%d\n",&il);
			sum+=il;
		}
        printf("the mean is... %f\n",(sum/entries) );
        break;
	case 2:
		scanf("enter the number of entries...%d\n",&med);
		arr[med];
		for (int ko=0;ko<med;ko++){
			scanf("enter data__%d\n",&arr[ko]);
		}
		if(med%2!=0){
			 new=med+1;
			printf("the median is....%d\n",arr[(new/2)+1]);
		}
		else{
			 fin=(arr[med/2])+(arr[(med/2)]);
			printf("the median is...%d\n",fin );
		}
		break;
	case 3:
		scanf("enter the mean--%d\nenter the no. of entries..%d\n",&mea,&ent);
		for (int jh=0;jh<ent;jh++){
			scanf("enter data__%d\n",&il3);
            sum2+=il3;
		}
		float var=(mea*ent)-sum2;
		printf("variable is__%d\n",var );
		break;
	default:
	    printf("invalid choice...\n");
}
}