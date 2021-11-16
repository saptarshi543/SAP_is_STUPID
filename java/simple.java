import java.util.*;
import java.lang.Math;
public class simple
{
	public static void main(String sap[])
	{
System.out.println("today we will find the simple interest....");
System.out.println("enter customer`s name.....");
Scanner input = new Scanner(System.in);
String h;
h=input.nextLine();
System.out.println("enter the principal ammount......");
Scanner sc=new Scanner(System.in);
double p=sc.nextDouble();
System.out.println("enter the rate......");
double rate=sc.nextDouble();
System.out.println("enter the time in years.....");
double time=sc.nextDouble();
double si=0.0;
si=(p*rate*time)/100;
System.out.println("the simple interest is...."+si);
double jk=0.0;
jk=(p+si);
System.out.println("And the total amount to be paid by MR/MRS/MS. "+h+" is= "+jk+"rupees");
System.out.println("thank you for using our services.   Developed by sap");
	}
}