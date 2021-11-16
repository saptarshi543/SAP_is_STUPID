import java.util.*;
public class namesap
{
	public static void main(String sap[])
	{
		System.out.println("enter your name..");
		Scanner input=new Scanner(System.in);
		String name;
         name=input.nextLine();
         double rt=0.0;
         rt=name.length();
         System.out.println("your name is "+rt+" characters long [including any gaps(if provided)]");
         System.out.println("how many times do you want to print your name?>");
         double i=input.nextDouble();
         int l;
         for(l=1;l<=i;l++)
         {
         	System.out.println(name+" WELCOME ...");
         }
	}
}