import java.util.*;
public class primethree
{
	public static void main(String ds[])//working....
	{
		Scanner nrt=new Scanner(System.in);//success..........
		System.out.println("enter a Number...");
		int user=nrt.nextInt();
		if (((user%2)==0)||((user%3)==0)||((user%5)==0)||((user%7)==0)||((user%11)==0)) {
			System.out.println(user+"> is not a prime Number...");
		}
		else{
			System.out.println(user+"> it is a prime number...");
		}
		nrt.close();
	}
}