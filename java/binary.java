import java.util.*;
public class binary{
    // working....
    public static int BinarySearch(int arr[], int first, int last, int element){
        int mid=(first+last)/2;
        while(first<=last){
            if(arr[mid]<element){
                first=mid+1;
            }else if(arr[mid]==element){
                return mid;
            }else{last=mid-1;}
            mid=(first+last)/2;
        }
        return -1;
    }
    public static void main(String a[]){
        int A[]={12,14,34,56,57,67,74,83,89,90,91};
        int index=BinarySearch(A,0,(A.length-1),89);
        System.out.println("index: "+index);
    }
}
