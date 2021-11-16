import java.util.*;//working.......for n no. of digits..
public class armstrong_for_n_digits{//success.....
	public static void main(String k[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("we will check armstrong number for n digits\nenter a number");
		int n=nrt.nextInt();
		int copy1=n;
		int copy2;
		int result=0;
		int no_digits=0,digit;
		for(;copy1!=0;copy1/=10){
            ++no_digits;
		}
		copy2=n;
		for(;copy2!=0;copy2/=10){
			digit=copy2%10;
			result+=Math.pow(digit,no_digits);
		}
		if(result==n)
			System.out.println(n+" is an armstrong number");
		else
			System.out.println(n+" is not an armstrong Number");
		nrt.close();
	}
}