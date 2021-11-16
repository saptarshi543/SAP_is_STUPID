import java.util.*;
import java.lang.Math;
public class physics
{
	public static void main(String he[])
	{
		System.out.println("Today we are going to find the displacement of an object in the last second of the journey");
		System.out.println("please enter the following ");
		System.out.println("total time in seconds:");
		System.out.println("please enter the values and do not include any units.....");
		//time=time
		Scanner sc=new  Scanner(System.in);
		double time=sc.nextDouble();
	    double a=(2*9.8);
	    double n=(time-1);
	    double r=2.0;
	    double lin=Math.pow(n,r);
	    double kj=0.0;
	    kj=(a*lin);
	    System.out.println("the displacementof the object in the last second is "+lin+" meters");

	}
}