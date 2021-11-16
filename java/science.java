import java.util.*;
import java.lang.Math;
public class science
{
	public static void main(String sap[])
	{
		Scanner io=new Scanner(System.in);
		System.out.println("welcome to scientific calculator....");
		System.out.println("\ncircle-1\ntriangle-2\ncylinder-3\nother-4\n");
		double radius,vh;
		double cd=0.0;
		char sign,ui;
		sign=io.next().charAt(0);
		switch(sign)
{
	    case'1':
			       System.out.println("enter radius...\n circle-1 \nsemicircle-2");
			       radius=io.nextDouble();
			       ui=io.next().charAt(0);
             switch(ui)
               {
              	case '1':
                cd=(3.1416*radius*radius);
                vh=(6.2832*radius);
                System.out.println("the area is "+cd+"\nthe perimetre is "+vh);
                break;
                case '2':
                cd=(1.5708*radius*radius);
                vh=(3.1416*radius);
                System.out.println("the area is "+cd+"\nthe perimetre is "+vh);
                break;
                default:
                System.out.println("Error");
                break;
               }
        break;       
        case '2':
                System.out.println("equilateral-1\nisoceles-2\nscalene-3");
                char du=io.next().charAt(0);
             switch (du)
               {
              	case '1':
              	System.out.println("enter the common side..");
              	double rt=io.nextDouble();
              	cd=(3*rt);
              	double al=Math.pow(rt,2);
              	vh=1.7320*(al/4);
              	System.out.println("the area is "+cd+"\nthe perimetre is "+vh);
              	break;
              	case '2':
              	System.out.println("enter the base and height.");
              	rt=io.nextDouble();
              	double rt1=io.nextDouble();
              	cd=(1/2)*(rt*rt1);
              	double kj=(Math.pow(rt,2))+(Math.pow(rt1,2));
              	vh=Math.sqrt(kj);
              	System.out.println("the area is "+cd+"\nthe perimetre is "+vh);
              	break;
              	case '3':
              	System.out.println("enter the three sides..");
              	double side1=io.nextDouble();
              	double side2=io.nextDouble();
              	double side3=io.nextDouble();
               rt=(side1+side2+side3)/2;
              	cd=Math.sqrt(rt*(rt-side1)*(rt-side2)*(rt-side3));
              	vh=(side1+side2+side3);
              	System.out.println("the area is "+cd+"\nthe perimetre is "+vh);
              	default:
              	System.out.println("Error");
              	break;
              }
        break;       
        case '3':
                System.out.println("enter the height and radius..");
                double height,re;
                height=io.nextDouble();
                re=io.nextDouble();
                cd=(6.2832*re*re)+height*(6.2832*re);
                vh=(2*(re*re))+(2*height);
                System.out.println("the area is "+cd+"\nthe perimetre is "+vh);
        break;
        case '4':
                System.out.println("value of:\nin 0=0\nsin 30=1/2\nsin 45=1/√2\nsin 60=√3/2\nsin 90=1\ncos 0=1\ncos 30=√3/2\ncos 45=1/√2\ncos 60=1/2\ncos 90=0\ntan 0=0\ntan 30=1/√3\ntan 45=1\ntan 60=√3\ntan 90=undefined\ncosec 0=undefined\ncosec 30=2\ncosec 45=√2\ncosec 60=2/√3\ncosec 90=1\nsec 0=1\nsec30=2/√3\nsec 45=√2\nsec 60=2/√3\nsec 90=undefined\ncot 0=undefined\ncot 30=√3\ncot 45=1\ncot 60=1/√3\ncot 90=0");
       break;
      default:
      System.out.println("Error..");
}       
}
}