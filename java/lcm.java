import java.util.*;//success.......
public class lcm{//working........
	public static void main(String j[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("we will find lowest common multiple...\nenter the number...");
        int n=nrt.nextInt();
        System.out.println("multiples are>");
         for(int i = 2; i< n; i++) {
         while(n%i == 0) {
            System.out.println(i+" ");
            n = n/i;
         }
      }
       if(n >2) {
         System.out.println(n);
      }
}
}