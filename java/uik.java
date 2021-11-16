import java.util.*;
public class uik
{
    public static void main(String afh[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name..");
        System.out.println("enter your address...");
        System.out.println("enter your age.");
        String name;
        name=sc.nextLine();
        String add;
        add=sc.nextLine();
        int age=sc.nextInt();
        System.out.println("your age,name and address is"+age+name);
        System.out.println(add);
        if(age<18 && age<20)
        {
            System.out.println("you are neither eligible to vote nor are you old enough for the job");
        }
     else if (age>18 && age >20)
        {
            System.out.println("you are eligible to vote..MR./MRS "+name);
            System.out.println("you are also eligible for the job");
        }   
            else if(age>18 && age<20)
            {
                System.out.println("you are eligible to vote but not eligible for the job");
                System.out.println(" as you are not yet 20 years old");
            }
            else if(age>18 && age<60)
            {
                System.out.println("you are still eligible for this job...as well as eligible to vote");
            }
            else 
            {
                System.out.println("SORRY!! you are no longer eligible for the job but you can still vote..");
            }

            
        }
    }
