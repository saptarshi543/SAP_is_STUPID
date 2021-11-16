import java.util.Scanner;//working......
public class factorial{//success......
	public static void main(String v[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("we will find factorial\nenter a Number");
		int n=nrt.nextInt();
		nrt.close();
		int f=1;
		for(int g=1;g<=n;g++){
           f*=g;
		}
	System.out.println("the factorial is "+f);
	}
}