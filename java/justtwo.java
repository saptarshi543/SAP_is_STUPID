import java.util.*;
public class justtwo
{
	public static void main(String sap[])//assuming input is >>1234
	{String new1="";                     //output will be
		Scanner nrt=new Scanner(System.in);    //1
		System.out.println("enter a Number..");//2
        String num=nrt.nextLine();             //3
        int len=num.length();                  //4
        int j;
        for (j=(len-1);j>=0 ;j-- ) {
        	char ch=num.charAt(j);
            new1+=ch;
        }
        int num2=Integer.parseInt(new1);
        int i;
        while(num2>0){
          i=num2%10;
          System.out.println(i);
          num2=num2/10;
        }
        nrt.close();
	}
}