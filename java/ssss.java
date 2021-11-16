import java.util.*;
public class ssss
{
	public static void main(String sap[])
	{
		System.out.println("we will convert  ASCII number to alphabets(or some Characters)..");
		System.out.println("enter the number of entries");
		Scanner io=new Scanner(System.in);
		int user=io.nextInt();
		String fin="...";
		int j;
		for(j=0;j<user;j++)
		{
			System.out.println("enter the ascii value::");
			int yu=io.nextInt();
			char ascii=(char)yu;
		    fin=(fin+ascii);
		}
		System.out.println(fin);
	}
}