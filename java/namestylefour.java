import java.util.*;
public class namestylefour
{
	public static void main(String sap[])//assuming input is>abcd
    {                                    //output will be
    	String rt="",ry="";                   //a
    	Scanner rev=new Scanner(System.in);   //ab
    	System.out.println("enter your name");//abc
    	String name=rev.nextLine();           //abcd
		int len=name.length();
    	int j;
    	for (j=0;j<len ;j++ ) 
    	{
    		char ch=name.charAt(j);
            rt=rt+ch;
			System.out.println(rt);
		}
		rev.close();
	}
}