import java.util.*;
public class conn
{
    public static void main(String rn[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your name.");
        String name;
        name=input.nextLine();
        int i;
        for(i=0;i<name.length();i++)
        {
            char t=name.charAt(i);
            
            System.out.println (t);
        }

        System.out.println ("your name is "+name.length()+" characters long including any gaps/space if provided");
    }
}