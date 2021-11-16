import java.util.*;
public class perfectsquare{
public static void main(String dd[]){//working....
	Scanner nrt=new Scanner(System.in);//success....
	System.out.print("enter a number to check if it is a perfect square>");
	int n=nrt.nextInt();
	if ((Math.sqrt(n)-(Math.floor(Math.sqrt(n))))==0)
		System.out.println("it is a perfect square");
	else
		System.out.println("not a perfect square");
	nrt.close();
}
}