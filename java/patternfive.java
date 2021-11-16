import java.util.Scanner;
public class patternfive{
	public static void main(String f[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter a Character\n enter a Number");
		char c=nrt.next().charAt(0);
        int n=nrt.nextInt();
        nrt.close();
        for(int s=0;s<=n;s++){
        	System.out.print(c);
        	for(int d=0;d<=s;d++){
             System.out.println();
        	}
        }
	}
}/*assuming output is f\n4
f
f

f

f


f




f*/