import java.util.*;
public class schoolX{
	public void series(int n){//it is a fibonacci series...
		int sum=1;
		// series=>0+1+1+2+3+4+..+n
		for(int r=0;r<=n;r++){
			sum+=r;
		}
		System.out.println("sum is> "+sum);
	}
	public static int IsPrime(int k){//working...tested..
		boolean flag=false;
		for(int r=2;r<=(k/2);r++){
			if(k%r==0){flag=true;
				break;}
		}
		if(flag==false){return 1;}
		else{return 0;}
	}
	public static int justReverseItDamnIt(int j){//working..tested..
		int copy=j,rem,rev;
		for( rev=0;copy!=0;copy/=10){
			rem=copy%10;
			rev=rev*10 +rem;
		}
		return rev;
	}
	public static int hcf(int n1,int n2){//working...tested..
		int hcf=0;
		for(int r=1;r<=n1 && r<=n2;r++){
			if ((n1%r==0)&&(n2%r==0)){hcf=r;}
		}
		return hcf;
	}
	public static int lcm(int nu1,int nu2){//working...tested..
		int lcm=(nu1*nu2)/(hcf(nu1,nu2));
		return lcm;
	}
	public static int checkperfect(int r){//working....tested..
		int sum=0;
		for(int p=1;p<r;p++){
			if(r%p==0){sum+=p;}
		}
		if(sum==r){return 1;}
		else{return 0;}
	}
	public static int palindrome(int z){//working...tested.
		int c=z;
		int revOfz=justReverseItDamnIt(z);
		if(revOfz==c){return 1;}
		return 0;
	}
	public static int Emirp(int w){//working....tested...
		int result1=IsPrime(w);
		if(result1==1){
			int ver=justReverseItDamnIt(w);
			if(IsPrime(ver)==1){return 1;}
		}
			return 0;
	}
	public static void main(String f[]){
		//for checkperfect..
		/*int res=checkperfect(28);
		if(res==1){
        System.out.println( "perfect number");
    }else if(res==0){
        System.out.println( "not a perfect number");
    }*/
    //checkperfect ends here..
    //Scanner nrt =new Scanner(System.in);
    //int n=nrt.nextInt();
    /*series(n);
    IsPrime(n);
    justReverseItDamnIt(n);
    hcf(n);
    lcm(n);
    checkperfect(n);*/
    int y=Emirp(167);
    if(y==1){System.out.println("y");}
    else if(y==0){System.out.println("n");}
    System.exit(0);
	}
}