import java.util.*;//success....
public class pythagoras{//working......
	public static void main(String sap[]){
		double side1,side2,user;
		System.out.println("we will use pythagoras theorem\nand will find the third side");
		System.out.println("enter the 1st side and the 2nd side");
		Scanner nrt=new Scanner(System.in);
        side1=nrt.nextDouble();
        side2=nrt.nextDouble();
        user=Math.sqrt((Math.pow(side1,2))+(Math.pow(side2,2)));
        System.out.println("the third side is.."+user);
        nrt.close();
	}
}