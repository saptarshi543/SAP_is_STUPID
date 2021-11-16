import java.util.*;
public class kilo
{
    public static void main(String args [])
    {
        System.out.println("enter how many kilograms......");
        Scanner sc= new Scanner(System.in);
        double kilo=sc.nextDouble();
        double i=0.0;
        i=(kilo*1000);
        System.out.println("the measurement in grams is "+i);

    }
}