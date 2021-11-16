import java.util.Scanner;
public class system{//success......
	public static void re(){//working.....
		Scanner nrt=new Scanner(System.in);
     System.out.println("exit system?\n 1-yes\n2-no");
     int i=nrt.nextInt();
     if (i==1) {
     	System.exit(0);
     }
     else if (i==2) {
     	re();
     }
     else{
     	System.out.println("invalid choice");
	    re();
	}
}
	public static void main(String d[]){
     re();
	}
}