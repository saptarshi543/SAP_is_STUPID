//binary search
import java.util.*;
public class binarySearch{//not working....
public static int binary(int arr[], int first, int last, int key){  
        if (last>=first){  
            int mid = first + (last - first)/2;  
            if (arr[mid] == key){  
            return mid;  
            }  
            if (arr[mid] > key){  
            return binary(arr, first, mid-1, key);//search in left subarray  
            }else{  
            return binary(arr, mid+1, last, key);//search in right subarray  
            }  
        }  
        return -1;  
    } 
	public static void main(String h[]){
		System.out.println("we will binary sort an aray..\nenter no. of entries");
	Scanner nrt=new Scanner(System.in);
	int n=nrt.nextInt();
	System.out.println("what do you want to search?");
	int se=nrt.nextInt();
	int g[]=new int [n];
	for (int f=0;f<n ;f++ ) {
		System.out.print("enter element");
		g[f]=(nrt.nextInt());
	}
	int last=g.length-1;
    int result=binary(g,0,last,se);
    if (result<=-1) {
    	System.out.println("element not found..");
    }
    else
    	System.out.println("element found at : "+result);
	}
}