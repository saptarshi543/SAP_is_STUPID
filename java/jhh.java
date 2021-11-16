import java.util.*;
import java.lang.*;
public class jhh {
public static void main(String args[])
	{
		System.out.println("enter any binary number...");
		Scanner sc=new Scanner(System.in);
		String num=sc.nextLine();
       int h=num.length();
       int de=0; // 100011101010
        int i,j;
        for (j=h-1, i=0;j>=0;j--)
        {
        	 char bic = num.charAt(j);
        	 int bint = Integer.parseInt(""+bic);
             int bu = Integer.parseInt(""+bic);
             int powt = (int)Math.pow(2,i); 
        	 de += bu*powt;
        	 i++;
        }
        System.out.println("Decimal Value of "+num+" is "+de);
	}

}