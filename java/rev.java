import java.util.*;
public class rev
{
	public static void main(String args[])
	{
		String nes2="";
		Scanner n=new Scanner(System.in);
		System.out.println("enter your name..");
		String name=n.nextLine();
		int ki=name.length();
		int j;
		for (j=(ki-1);j>=0 ;j-- ) 
		{
			char ch=name.charAt(j);
            char nes=(ch);
             nes2=nes2+ch;
		}
		System.out.println(""+nes2);
	}
}