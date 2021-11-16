import java.util.*;
public class proloy_2{
	public static int find_factorial(int n){
        int f=1;
        int sum=1;
		while(f<=n){
			sum*=f;
			f++;
		}
		return sum;
	}
	public static void main(String fo[]){
		System.out.println("just enter a number and get over with it..");
		Scanner nrt=new Scanner(System.in);
		int n=nrt.nextInt();
		double sum=0.0;
		for(int r=1;r<=n;r++){
			sum+=1/(find_factorial(r));
		}
		System.out.println(sum);
	}
}