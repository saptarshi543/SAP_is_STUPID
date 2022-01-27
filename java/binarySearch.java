//binary search
import java.util.*;
public class binarySearch{
    // working....
    public static int  binary_search(int target, int[] database){
        int start=0,end= database.length -1;
        while(start<=end){
            int mid= (start + end)/2;
            if(target== database[mid]){
                return mid;
            }else if(target < database[mid]){
                end= mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String d[]){
        Scanner nrt=new Scanner(System.in);
        System.out.println("enter no. of inputs: ");
        int no_of_inputs=nrt.nextInt();
        int user[]=new int[no_of_inputs];
        System.out.println("enter the elements\nplease enter in an increasing or decreasing order");
        for(int itr=0;itr<no_of_inputs;itr++){
            user[itr]=nrt.nextInt();
        }
        System.out.println("enter your element to search");
        int target=nrt.nextInt();
        int result_index=binary_search(target,user);
        System.out.println("index: "+(result_index-1)+"\n !! if result is negative that implies element is not found in the array !!");
    }
}
