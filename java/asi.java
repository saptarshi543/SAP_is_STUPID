import java.util.*;
public class asi// character to ascii value
{
	public static void main(String sap[])
	{
		Scanner u=new Scanner(System.in);
		System.out.println("enter a character...");
		char ch=u.next().charAt(0);
		int yu=(int)ch;
		System.out.println("the ascii value of "+ch+" is "+yu);
	}
}