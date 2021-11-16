import java.util.*;
public class ef 
{
public static void main(String kio[])
{
	Scanner input=new Scanner(System.in);
	System.out.println("enter your name and age...");
	String name;
	name=input.nextLine();
	long age=input.nextLong();
	System.out.println(name+" number of months you have spent on earth is "+(age*12));
	System.out.println(name+" number of days you have spent on earth(approx) is "+(age*12*30));
	System.out.println(name+" number of seconds you have spent on earth is "+(age*12*30*24*3600));
	System.out.println("It looks pretty long. Doesn`t it?");
}
}	
