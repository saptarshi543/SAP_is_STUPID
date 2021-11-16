import java.util.*;
public class bintodec
{
    public static void main(String args[])
    {
        Scanner ui=new Scanner(System.in);
        System.out.println("enter any decimal number....");
        String num=ui.nextLine();
        int ki=num.length();
        int j;//166
        for (j=(ki-1);j>=0;j--)// this project failed
        {
            char p=num.charAt(j);
            int lo=Integer.parseInt(""+p);
            if( lo>-1 && lo<1)
            {
                System.out.println("0000");
            }
            else if (lo>0 && lo<2)
            {
                System.out.println("1");
            }
            else if(lo>1 && lo<3)
            {
                System.out.println("10");
            }
            else if(lo>2 && lo<4)
            {
                System.out.println("11");
            }
            else if (lo>3 && lo<5 ) 
            {
                System.out.println("100");
            }
            else if(lo>4 && lo<6)
            {
                System.out.println("101");
            }
            else if(lo>5 && lo<7)
            {
                System.out.println("110");
            }
            else if(lo>6 && lo<8)
            {
                System.out.println("111");
            }
            else if(lo>7 && lo<9)
            {
                System.out.println("1000");
            }
            else if(lo>8 && lo<10)
            {
                System.out.println("1001");
            }
            else
            {
                System.out.println("invalid input.");
            }
        }
    }
}