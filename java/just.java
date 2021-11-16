import java.util.*;
public class just// a num will be separated
{                //assuming input is>>1234
	public static void main(String sap[])//output will be 
	{                                           //4
		Scanner nrt=new Scanner(System.in);     //3
		System.out.println("enter a Number.."); //2
		int num=nrt.nextInt();                  //1
		int i,ju,ju1;
		while(num>0) {
			ju=num%10;
			System.out.println(ju);
           num=num/10;
		}
	}
}