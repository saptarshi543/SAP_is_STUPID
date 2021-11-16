import java.util.*;
public class log {//working..success...


	/*
	a*y=z
	means....log a z=y
	a is in subscript...
	*/
	public static int one(int base,int result){//working..
		// 2**x=8
		// exponent=3
		// this function will return exponent....

		int exponent=0,test=0;
		while(true){
			test+=base;
			++exponent;
			if(Math.pow(base,exponent)==result){break;}
			if(exponent>1000){
				System.out.println("this kind of exponent is usually to large...exiting");
				System.exit(0);
			}
		}
		return exponent;
	}
	public static int two(int exponent,int result){//working....
		//this function will take exponent and result..and return base
		// eg: 2**4=16
		// parameters= 16,4
		// return 2

		int base=0;
		while(true){
			if(Math.pow(base,exponent)==result){break;}
			++base;
		}
		return base;
	}
	public static int three(int base,int exponent){
		return (int)Math.pow(base,exponent);
	}
	public static void main(String args[]){
		// trying to make a java program to solve certain log functions..
		log L=new log();
		Scanner nrt=new Scanner(System.in);
		// int test_base=2,test_result=16,test_exponent=4;

		// driver code...
		while(true){
			System.out.println("enter your choice...\n1: find exponent\n2:find base\n3: find result\n4: exit");
			int tmp=nrt.nextInt();
			if(tmp==1){
				System.out.println("enter base and result....");
				int base=nrt.nextInt();
				int result=nrt.nextInt();
				System.out.println("exponent..."+L.one(base,result));
			}else if(tmp==2){
				System.out.println("enter exponent and result");
				int exponent=nrt.nextInt();
				int result=nrt.nextInt();
				System.out.println("base...."+L.two(exponent,result));
			}else if (tmp==3) {
				System.out.println("enter base and exponent");
				int base=nrt.nextInt();
				int exponent=nrt.nextInt();
				System.out.println("result...."+L.three(base,exponent));
			}else if (tmp==4) {break;}
		}
	}
}