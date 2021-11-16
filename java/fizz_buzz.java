import java.util.*;
public class fizz_buzz{
	//working...
	public static void Buzz_Fizz(int upper_bound,int lower_bound,int arg1,int arg2){
		for(int i=lower_bound;i<=upper_bound;i++){
			System.out.println(((i%arg1==0)&&(i%arg2==0))?"FizzBuzz":((i%arg1==0)?"Fizz":((i%arg2==0)?"Buzz":i)));
		}
	}
	public static void main(String d[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter upper bound,lower bound, arg1 ,arg2\n arg1 and arg2 are the numbers of which multiples will be checked");
		fizz_buzz B=new fizz_buzz();
		int upper=nrt.nextInt();
		int lower=nrt.nextInt();
		int a1=nrt.nextInt();
		int a2=nrt.nextInt();
		B.Buzz_Fizz(upper,lower,a1,a2);
	}
}