import java.util.*;
import java.lang.Math;
public class kil
{
	public static void main(String sap[])//failed
	{
		Scanner inu=new Scanner(System.in);
		System.out.println("we will convert hexadecimal to octal..");
		System.out.println("enter any octal no...please do not give a no. more than 4 digits");
		String num=inu.nextLine();
		int ki=num.length();
		int dt=Integer.parseInt(num);
		int ko=0;
		int j,o;//111213=>6=5
		for (j=ki-1,o=0;j>=0;j--)
		{
			char po=num.charAt(j);
			int gu=Integer.parseInt(""+po);
			int iuj=(int)Math.pow(16,o);
			ko = (ko+(iuj*gu));
			o++;
		}
					System.out.println(ko);
	}
}