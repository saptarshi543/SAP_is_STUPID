import java.util.Scanner;
public class bmi{//working...
	public static void main(String d[]){//still needs modification for more accurate results...
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter your >weight in kg...\n  >height in cm..");
		float wt=nrt.nextFloat(),h=nrt.nextFloat();
		float h1=(h/100);
		float bmi=wt/(h1*h1);
		System.out.println(bmi);
		if(bmi>=19 && bmi<=24.9){
         System.out.println("normal weight");
		}
		else if(bmi>=25 &&bmi <=29.9){
			System.out.println("over weight\n workout if you can...");
		}
		else if(bmi>=30 && bmi<=34.9){
			System.out.println("obesity level 1\n danger but still under control");
		}
		else if(bmi>=35 && bmi<=39.9){
			System.out.println("obesity level 2\ndanger");
		}
		else if(bmi>=40){
			System.out.println("obesity level 3\nhigh danger..");
		}
		else
			System.out.println("Error encountered..");
	}
}