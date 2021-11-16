import java.util.*;
public class conve
{
public static void main(String sap[])
{//conversion from any line to ascii values..
    Scanner ne=new Scanner(System.in);
    System.out.println("enter a line");
    String line=ne.nextLine();
    int len=line.length();
    int i;
    for (i=0;i<len ;i++ ) {
     	char ch=line.charAt(i);
         int nrt=(int)(ch);
     	System.out.println(">>"+nrt);
     } 
}
}