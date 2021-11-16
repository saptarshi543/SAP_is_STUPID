import java.util.*;
import java.lang.Math;
public class binary{
//its working....but i will analyse it later for efficiency
    public static int binaryS(int a[],int key){
        int low = 0,high=a.length-1;
        int index=0;
        while(low<=high){
            int mid=low+ (high-low)/2;
            if(a[mid]==key)
                return mid;
            if(a[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
    public static void main(String s[]){
    //let's do binary search...
        Scanner nrt=new Scanner(System.in);
        System.out.println("enter no.of terms");
        int n=nrt.nextInt();
        int user[]=new int[n];
        for(int r=0;r<n;r++){user[r]=nrt.nextInt();}
        System.out.println("what do you want to search...");
        int t=nrt.nextInt();
        nrt.close();
        Arrays.sort(user);
        int result=binaryS(user,t);
        if(result==-1){System.out.println("not found");}
        else
            System.out.println("element found at index "+result);
}}