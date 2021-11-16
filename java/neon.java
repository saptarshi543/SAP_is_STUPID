import java.util.*;
public class neon
{
	public static void main(String sap[])//working
	{
		int num2,num3,len,i,pro=0,next=0;//success......
		String num,hi;
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter a number");//assuming the input is <..9..>
		num=nrt.nextLine();//"9"
		num2=Integer.parseInt(""+num);//converted to> 9
        num3=(num2*num2);//9*9=81
        hi=String.valueOf(num3);//"81"
        len=hi.length();//2
        for (i=0;i<len ;i++ ) {
        	char ch=hi.charAt(i);// 1st ch=8,2nd ch=1
        	pro=Integer.parseInt(""+ch);
            next=next+pro;
        }
        if (next==num2) {//checking block.....
        	System.out.println("it is a neon Number....");
        }
        else {//default block..
        	System.out.println("not a neon number...");
        }
        nrt.close();
	}
}