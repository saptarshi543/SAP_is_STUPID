 /*
 working.........
 success.........*/
 class style extends Thread{
	public static void main(String h[]){
		style s=new style();
		s.start();
	}
	public void run(){
		try{
			for(;;){
		for(int i=0;i<15;i++){//this one is working...
			for(int f=0;f<i;f++){
				System.out.print("  ");
			}
			System.out.println("#");
			Thread.sleep(60);
		}
		for(int e=15;e>0;e--){
			for (int q=0;q<e ;q++ ) {
				System.out.print("  ");
			}
			System.out.println("#");
			Thread.sleep(60);
		}
	}
}
	catch(InterruptedException e){System.out.println(e);}
	}
}
public class zig_zag{
	public static void main(String k[]){
		style s=new style();
		s.start();
	}
}