import java.util.*;
public class meanmedian{
public static void main(String h[]){//working......
Scanner nrt=new Scanner(System.in);//success.....
System.out.println("what do you need to find?\nmean__1\nmedian__2\nfind a variable when mean is given__3");
int n=nrt.nextInt();
int j,k,jl,lj,il;
float med,sum=0;
if(n==1){
System.out.println("enter the no. of entries...");
j=nrt.nextInt();
for (k=0;k<j ;k++ ) {
System.out.println("enter the data..");
il=nrt.nextInt();
sum+=il;
}
System.out.println("the mean is> "+(sum/j));
}
if(n==2){
System.out.println("enter the no. of entries...");
jl=nrt.nextInt();
int arr[]=new int[jl];
for (lj=0;lj<jl ;lj++ ) {
arr[lj]=(nrt.nextInt());
}
if(jl%2==0){
med=(1/2)*(((float)Math.floor(arr.length / 2))/2)+((float)Math.floor(arr.length / 2)/2+1);
System.out.println("median is> "+med);
}
else{
med=((float)Math.floor(arr.length / 2))/2;
System.out.println("median is> "+med);
}
}
else if (n==3){
System.out.println("enter the mean...\nenter the no. of entries...");
float mean=nrt.nextFloat();
int ent=nrt.nextInt(),sum2=0;
for (int a=1;a<ent;a++){
sum2+=(nrt.nextInt());
}
float find=(mean*ent)-sum2;
System.out.println("the variable is> "+find);
}
else{
	System.out.println("invalid choice....");
}
}
}