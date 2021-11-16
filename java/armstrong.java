import java.util.*;
public class armstrong
{
	public static void main(String sap[])//working...but only for 3 digit numbers...
	{
		String user;//success..........
		int len,num,i,ki,tri,next=0;
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter a number...");
        user=nrt.nextLine();
        len=user.length();
        num=Integer.parseInt(user);
        for (i=0;i<len ;i++ ) {
        	char ch=user.charAt(i);
            ki=Integer.parseInt(""+ch);
            tri=(ki*ki*ki);
            next+=tri;
        }
        if (next==num) {
        	System.out.println("it is an armstrong number..");
        }
        else{
        	System.out.println("it is not armstrong number...");
        }
	}
}