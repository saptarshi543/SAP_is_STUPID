import java.util.*;
public class experiment
{
    public static void main(String args[])
    {
        System.out.println("enter your name.........");
        Scanner input=new Scanner(System.in);
        String name;
        name=input.nextLine();
        System.out.println("enter the year you were born.....");
        Scanner sc =new Scanner(System.in);
    double t= sc.nextDouble();
        double rt=0.0;//baby=0-5, kid=6-12,teen=13-19,adult=20++
        rt=(2020-t);
        System.out.println("MR/MRS/MS. "+name+" Your age is approximately....."+rt+" years");
if(rt>=1 && rt<=5){
    System.out.println("you are still a baby....");
}
else if(rt>=6 && rt<=12){
    System.out.println("you are a kid....");
}
else if(rt>=13 && rt<=19){
    System.out.println("you are an teenager.....");
}
else{
    System.out.println("you are an adult.......");
}
}
}