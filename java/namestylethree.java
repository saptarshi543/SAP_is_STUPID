import java.util.*;
public class namestylethree
{
	public static void main(String sap[])   //sap will be printed as
	{                                       //p
		String ft="";                       //pa
		Scanner rev=new Scanner(System.in); //pas
		System.out.println("enter your name");
		String name=rev.nextLine();
		int len=name.length();
		int j;
		for (j=(len-1);j>=0 ;j-- ) 
		{
			char ch=name.charAt(j);
            ft=ft+ch;
            System.out.println(ft);
		}
		System.out.println();
	}
}