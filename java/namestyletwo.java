import java.util.*;
public class namestyletwo
{
	public static void main(String sap[])
	{
		String rt="";//corrupt....
		Scanner rev=new Scanner(System.in);//will go on for infinity...
		System.out.println("enter your name....");//perfect for a virus...
		String name=rev.nextLine();
		int len=name.length();
		int i,j;
		for (j=0;j<len;j++ ) 
		{
			for (i=len;j>0;j--){
			char ch=name.charAt(j);
            rt=rt+ch;
            System.out.println(rt);
		}
		}
		System.out.println();
		rev.close();
	}
}