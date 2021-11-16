//a simple program to find duplicate no. in a integer array
//if a no. exists more than once it gets displayed also if there are other duplicate
//  no.s they too will get displayed
import java.util.*;//working.....
public class duplicate{//success..........
	public static void find_duplicate(int  arr[]){
//let's create a dummy array...
		Arrays.sort(arr);
		int len=(arr.length)-1;
		int occurences=0,current;
		for(int r=0;r<len;r++){
			if(arr[r]==arr[r+1]){
				occurences++;
				current=arr[r];
				System.out.println(current+" exists more than once.");
			}
		}
		System.out.println("total occurences "+occurences);
	}
	public static void main(String d[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("we will find duplicate no.s in an array\n enter no. of an array");
		int n=nrt.nextInt()+1;
		System.out.println("enter the no.s..");
		int original[]=new int[n-1];
		for(int q=0;q<(original.length);q++){
			original[q]=(nrt.nextInt());
		}
		find_duplicate(original);
	}
}