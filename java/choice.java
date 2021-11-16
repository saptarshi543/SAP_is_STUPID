import java.util.*;
public class choice
{
    public static void main(String args[])
    {
        System.out.println("enter your year of birth and month");
        System.out.println("examples= if you are born in 2005 , february;");
        System.out.println("it will be like>> 2005.02  number of the month...");
        Scanner sc=new Scanner(System.in);
        double date=sc.nextDouble();
        double f=0.0;
        f=(2020.08-date);
        System.out.println("your age and month is (approx) ....."+f);
    }    
}