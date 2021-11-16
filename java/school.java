import java.util.Scanner;
public class school{
	public static void main(String z[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("question 5,6,7,8,9,10");
		System.out.println("solving 1st question  \n enter month no.");
		switch(nrt.nextInt()){
			case 1:
			System.out.println("january");
			break;
			case 2:
			System.out.println("february");
			break;
			case 3:
			System.out.println("march");
			break;
			case 4:
			System.out.println("april");
			break;
			case 5:
			System.out.println("may");
			break;
			case 6:
			System.out.println("june");
			break;
			case 7:
			System.out.println("july");
			break;
			case 8:
			System.out.println("august");
			break;
			case 9:
			System.out.println("september");
			break;
			case 10:
			System.out.println("october");
			break;
			case 11:
			System.out.println("november");
			break;
			case 12:
			System.out.println("december");
			break;
			default:
			System.out.println("invalid choice");
		}
		System.out.println("solving 2nd question\n ");
		System.out.println("the 1st 20 natural numbers are");
		for (int r=1;r<21;r++){
			System.out.println(r);
		}
		System.out.println("solving 3rd question\nenter a Number to find its table till 10");
		int z1=nrt.nextInt();
		for (int f=1;f<11;f++){
			System.out.println(f+" X "+z1+"="+(f*z1));
		}
		System.out.println("solving 4th question\n enter a number to find its factorial");
		int fac=1,hg=nrt.nextInt();
        for (int u=1;u<=hg;u++){
        fac=fac*u;
        }
        System.out.println("factorial is "+fac);
		System.out.println("solvimg 5th question\n printing pattern..");
		int j,i;
		for (i=0;i<5 ;i++ ) {
			for (j=0;j<=i ;j++ ) {
				System.out.print("R");
			}
			System.out.println();
		}
		System.out.println("solvimg 6th question\n enter the marks of 5 subjects..");
		int su=0,h;
        for (h=1;h<6 ;h++ ) {
        	System.out.println("enter the Number of subject "+h);
            su+=(nrt.nextInt());
        }
        System.out.println("total marks = "+su);
	}
}