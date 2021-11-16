import java.util.*;
public class namestyle
{
	public static void main (String[] args) 
	{
		String hel="";
		Scanner one=new Scanner(System.in);
		System.out.println("enter your name");
		String name=one.nextLine();
		int len=name.length();
		int j,i;
		for (j=0;j<len ;j++ ) 
		{
			for (i=1;i<=len ;i++ ) 
			{	
			char ch=name.charAt(j);
            hel=hel+ch;
			System.out.println(hel);
		}
		System.out.println();
		}
	}
}