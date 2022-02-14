import java.util.*;

public class bubblesort{
	//working....
	public static void bubblesort(int t[]){
	for(int i=0;i<t.length-1;i++){
		for(int j=0;j<(t.length-i-1);j++){
			if (t[j] > t[j+1]){
			int tmp=t[j];
			t[j] = t[j+1];
			t[j+1]=tmp;
			}
		}
	}
	System.out.println("------------------------");
	for(int e:t){
		System.out.println(e);
	}
	}

	public static void main(String a[]){
Scanner nrt=new Scanner(System.in);
System.out.println("enter length");
int len=nrt.nextInt();
int arr[]=new int[len];
System.out.println("enter elements");
for(int itr=0;itr<len;itr++){
arr[itr]=nrt.nextInt();
}
bubblesort(arr);

}
}
