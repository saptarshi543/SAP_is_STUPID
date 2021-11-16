import java.util.Scanner;
public class idioticSchool{
	public static int fib(int d){//working...tested/..
		if(d==1 || d==2){return 1;}
		int fibonacci=1,f1=1,f2=1;
		for(int r=3;r<=d;r++){
			fibonacci=f1+f2;
			f1=f2;
			f2=fibonacci;
		}
		return fibonacci;
	}
	public static void main(String f[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter a num\nlet's find fibonacci series");
		int n=nrt.nextInt();
		System.out.println(fib(n));
	}
}