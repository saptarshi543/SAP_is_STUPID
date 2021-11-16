import java.util.*;
public class primetwo
{
	public static void main(String sap[])//original logic....
	{
		boolean fl=true;//working......
		Scanner nrt=new Scanner(System.in);//success....
		System.out.println("enter a Number...");
		int user=nrt.nextInt();
		int j;
		for (j=2;j<user ;j++ ) {
			if ((user%j)==0) {
                 fl=false;
				break;
			}
			else continue;
		}
		if (fl==false) {
			System.out.println(user+"> it is not a prime Number..");
		}
		else{
			System.out.println(user+"> it is a prime Number..");
		}
	}
}