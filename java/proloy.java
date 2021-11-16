import java.util.*;
public class proloy{
	public static void find_factorial(int n){
        int f=1,sum=0;
		while(f<=n){
			sum*=f;
			f++;
		}
		return sum;
	}
	public static void main(String fr[]){
		System.out.println("enter a no. we will find factorial");
		Scanner nrt=new Scanner(System.in);
	    int b=nrt.nextInt();
        long actual_sum=0;
          for(int m=1;m<=n;m++){
     	actual_sum+=(find_factorial(m));
     }
		/*int n=nrt.nextInt();
        int i=1,f=1;//innitialising i and f
        //can't give f's initial value as 0
        //because f will be multiplied with i
        //AND ANYTHING MULTIPLIED WITH 0 BECOMES 0
        //so f=1
		while(i<=n){//loop starts......
			f=f*i;//    i  is at 1st initiallised with a value 1 so loop starts with i as 1
			i++;//   f gets multiplied with i everytime the condition is satisfied...
		}
		//when i exceeds the value of "n" loop breaks...
		System.out.println(f);
	//doing the same thing in for loop
     int h,fact=1;
     for(h=1;h<=n;h++){
        fact=fact*h;
     }
     System.out.println("with for loop\n"+ fact);
	*/

    }
 }