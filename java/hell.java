 import java.util.*;
 public class hell
{
	public static void main(String sap[])
	{
		System.out.println("enter your age.....");
		Scanner sc=new Scanner(System.in);
		String age=sc.nextLine();
		double rt=0.0;
		rt=Integer.parseInt(age);
		System.out.println("is your age "+rt+" ? please confirm..type 1 for yes;2 for no");
        long ui=sc.nextLong();
		if (ui>0 && ui<2) {
			System.out.println("your age is "+rt);
			System.out.println("THANK YOU.....");
		}
		else if(ui>1 && ui<3)
		{
			System.out.println("your age is not "+rt+" ? ok got it...");
			System.out.println("THANK YOU.....");
		}
		else
		{
			System.out.println("INVALID INPUT...SORRY TRY AGAIN....");
		}
		
	}
}