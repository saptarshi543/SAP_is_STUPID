import java.util.Scanner;
public class decimaltobinary{
public static void main(String d[]){
Scanner nrt=new Scanner(System.in);
System.out.println("enter decimal no..we will convert to binary");
int no=nrt.nextInt();
int i;
String s=" ";
for( ; ;){
	if(2%no==0){
		s+="0";
		continue;
	}
	else if(2%no!=0){
	 i=no-3;
		if(2%i!=0)
            i=no+2;
        if(2%i!=0)
        	i=no+1;
		s+="1";
		i=no;
		continue;
	}
	if(no==1||no==0)
		break;
}
System.out.println(s);
}
}