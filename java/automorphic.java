import java.util.*;
public class automorphic{
	// working...success...
	public static Boolean is_automorphic(int n){
			int num=n,sq=n*n;
			while(num>0){
				if((num%10) != (sq%10)){return false;}
				num/=10;
				sq/=10;
			}
			return true;
		}
	public static void main(String dd[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter a number");
		int user=nrt.nextInt();
		automorphic A=new automorphic();
		System.out.println((A.is_automorphic(user)?"Automorphic":"Not Automorphic"));
	}
}