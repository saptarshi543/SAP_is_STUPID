import java.util.*;
public class wiz
{
	public static void main(String sap[])
	{
		System.out.println("enter your name..");
		Scanner re=new Scanner(System.in);
        String name=re.nextLine();
        int y=name.length();
        System.out.println("your name in ASCII value is");
        int j;
		for(j=0;j<y;j++)
		{
			char t=name.charAt(j);
            int kj=(int)t;
			System.out.println(kj);
		}
	}
}