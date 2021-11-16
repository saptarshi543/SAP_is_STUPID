import java.util.*;
public class rtt
{
    public static void main(String sap[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name....");
        String name;
        name= sc.nextLine();
        System.out.println("enter your age....");
        double age=sc.nextDouble();
        
        int kj;
        for(kj=1;kj<11;kj++)
        {
            System.out.println("my name is "+name+" and my age is "+age+" this is the"+kj+"th print" );
        }
    }
}