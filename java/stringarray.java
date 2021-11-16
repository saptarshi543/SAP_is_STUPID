import java.util.*;
public class stringarray{
	public static void main(String sa[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter a string");
		String user=nrt.nextLine();
		String arr[]=user.split("0");
		int i,len=(user.length());
		for (i=0;i<=len ;i++ ) {
			System.out.println(arr[i]+"\n");
		}
	}
}