import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class conversion{
	// working...success..
public static int get_no_Of_digit(int t){//working...
		int ans=0,copy=t;
		while(copy>0){
			ans++;
			copy/=10;
		}
		return ans;
	}
public static String reverse(String r2){
		String ans="";
		for(int i=r2.length()-1;i>=0;i--){
			ans+=r2.charAt(i);
		}
		return ans;
	}
public static int Octal_to_decimal(int n){//working..
		conversion T=new conversion();
		int ans=0,copy=n,no_of_digits=T.get_no_Of_digit(n);
		for(int i=0;i<no_of_digits;i++){
		ans+=((copy%10)*((int)(Math.pow(8,i))));
		copy/=10;
		}
		return ans;
	}
public static String Decimal_to_hexadecimal(int n){//working...
		String ans="";
		int tmp=0,copy=n;
		while (true) {
			tmp=copy%16;
			ans+=tmp;
			if((copy<=0)||(copy<16)){break;}
			copy=(int)(copy/16);
		}
		conversion T=new conversion();
		return T.reverse(ans);
	}
public static String Decimal_to_octal(int n){//working...
		int copy=n,tmp=0;
		String ans="";
		while(true){
			tmp=copy%8;
			ans+=tmp;
			if((copy<=0)||(copy<8)){break;}
			copy=(int)(copy/8);
		}
		conversion T=new conversion();
		return T.reverse(ans);
}

public static int Hexa_to_decimal(String n){//working...
	String dataS[]=n.split(" ");
	Map data=new HashMap();
		data.put("A",10);
		data.put("B",11);
		data.put("C",12);
		data.put("D",13);
		data.put("E",14);
		data.put("F",15);
		Set set=data.entrySet();
		int tmpI=0,ans=0,count=0;
		for(int i=dataS.length-1;i>=0;i--){
			String sap=dataS[i];
			try{
				tmpI=(int)(data.get(sap));
				}
			catch(NumberFormatException e){}
			catch (NullPointerException e){}
			finally{
				try{
					tmpI=Integer.parseInt(sap);
				}
				catch (NumberFormatException e){}
				catch (NullPointerException e){}
			}
			ans += tmpI*(Math.pow(16,count));
			++count;
		}
return ans;
}

public static void main(String dd[]){
    Scanner nrt=new Scanner(System.in);
    conversion main=new conversion();
    InputStreamReader i_obj=new InputStreamReader(System.in);
    BufferedReader buffer=new BufferedReader(i_obj);
    while(true){
    System.out.println("1:Decimal To Octal\n2:Decimal To Hexadecimal\n3:Octal To Decimal\n4:Hexadecimal to Decimal");
    System.out.println("enter any other no. to exit..");
    int tmpM,choice=nrt.nextInt();
    String tmpMS;
    if(choice==1){
    	System.out.println("enter no.");
    	tmpM=nrt.nextInt();
    	System.out.println("\n>>>"+main.Decimal_to_octal(tmpM)+"<<<\n");}
    else if(choice==2){
    System.out.println("enter no.");
    	tmpM=nrt.nextInt();
    	System.out.println("\n>>>"+main.Decimal_to_hexadecimal(tmpM)+"<<<\n");}
    else if(choice==3){
    	System.out.println("enter no.");
    	tmpM=nrt.nextInt();
    	System.out.println("\n>>>"+main.Octal_to_decimal(tmpM)+"<<<\n");}
    else if(choice==4){
	    System.out.println("enter hexadecimal. You may add Characters instead of only no.s");
	    try{tmpMS=buffer.readLine();
	    System.out.println("\n>>>"+main.Hexa_to_decimal(tmpMS)+"<<<\n");}
	    catch(IOException e){}
	    }
	else{break;}}
nrt.close();
}
}
