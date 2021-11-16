import java.util.*;
/*working...
success...*/
public class evenpal{
	public static void main(String f[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter a number");
		int n=nrt.nextInt();
		int copy1=n,sumofdigits=0;
		//reverse the number
		while(copy1!=0){
			sumofdigits+=(copy1%10);
			copy1/=10;
		}
		int copy2=n,rev=0;
		while(copy2!=0){
rev= (rev*10)+(copy2%10);
			copy2/=10;
		}
		System.out.println("reverse--- "+rev);
		if(sumofdigits%2==0 && rev==n)System.out.println("evenpal");
		else System.out.println("not evenpal");
	}
}