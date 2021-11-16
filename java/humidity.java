import java.util.Scanner;
public class humidity{
	public static void main(String s[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("we will find relative humidity\n enter temp. in celsius");
		double te=nrt.nextDouble();
		double svp=(6.11*10)*((7.5*te)/(237.3+te));
		System.out.println("enter dew point...");
		double dp=nrt.nextDouble();
		double es2=(6.11*10)*((7.5*dp)/(237.3+dp));
		double rh=(svp/es2)*100;
		double ex1=Math.pow((((17.625*dp)/(243.04+dp))),2.7);
		double ex2=Math.pow((((17.625*te)/(243.04+te))),2.7);
        double experi=100*(ex1/ex2);
		System.out.println("relative humidity is> "+rh+"%");
		System.out.println("experimental value>> "+experi+"%");
	}
}