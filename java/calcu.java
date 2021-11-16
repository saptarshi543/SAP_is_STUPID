import java.util.*;
public class calcu
{
	public static void main(String sap[])
	{
		int u=0;
		System.out.println("welcome to calculator...");
		System.out.println("enter two numbers...");
		System.out.println("1-PLUS\n 2-SUBTRACTION\n 3-MULTIPLICATION\n 4-DIVISION\n 5-REMAINDER");
		Scanner io=new Scanner(System.in);
		int num1=io.nextInt();
		int num2=io.nextInt();
		char sign=io.next().charAt(0);
		switch(sign)
		{
			case'1':
			u=(num1+num2);
			System.out.println("the sum is "+u);
			break;
			case '2':
			u=(num1-num2);
			System.out.println("the subtraction is "+u);
			break;
			case '3':
			u=(num1*num2);
			System.out.println("the multiplication is "+u);
			break;
			case '4':
			u=(num1/num2);
			System.out.println("the division is "+u);
			break;
			case '5':
			u=(num1%num2);
			System.out.println("the remainder is "+u);
			break;
			default:
			System.out.println("ERROR.....");
			break;
		}
	}
}