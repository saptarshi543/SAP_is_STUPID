import java.util.*;
public class prime
{
	public static void main(String sap[])//shortcut logic....
	{
		int num1,i,num2,len;//working....
		String yt,num;//success...>>
		int hi=0;
         Scanner nrt=new Scanner(System.in);
         System.out.println("enter a number..");
          num=nrt.nextLine();
          num2=Integer.parseInt(num);
          len=num.length();
         for (i=0;i<len ;i++ ) 
         {
             char ch=num.charAt(i);
             yt=(""+ch);
               num1=Integer.parseInt(yt);
             hi=hi+num1;
         }
         if ((hi % 3)==0) {
         	System.out.println("it is not a prime number");
         }
         else if ((hi % 3)!=0) {
         	System.out.println("it is a prime number");
         }
         else{
         	System.out.println("error...");
         }
         nrt.close();
	}
}	