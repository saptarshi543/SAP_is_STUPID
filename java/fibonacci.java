import java.util.*;
public class fibonacci
{// working..........
	static boolean isit(int x)
	{
      int s=(int)Math.sqrt(x);
      return ((s*s)==x);
	}
	static boolean fibonacci(int n)
	{
		return isit((5*n*n)+4)||isit((5*n*n)-4);
	}
	public static void main(String sap[])
	{
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter a number..");
		int n=nrt.nextInt();
        if (fibonacci(n)==true) {
        	System.out.println("is a fibonacci number...");
        }
        else{
        	System.out.println("not a fibonacci number...");
        }
        nrt.close();
	}
}