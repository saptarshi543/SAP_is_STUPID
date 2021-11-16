import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;//success......
import java.util.*;//working..........
public class webthree{//this program is almost a virus....
	public static void main(String ar[]){//but the program runs for a limited no. of times
        Scanner nrt=new Scanner(System.in);
		System.out.println("what do you want to search?");
		String search=nrt.nextLine();
		for(int r=0;r<3;r++){
			try{
		String newurl="http://google.com/search?q="+(string_search_in_web(search));
		Desktop d=Desktop.getDesktop();
		d.browse(new URI(newurl)); 
	}
	catch(IOException | URISyntaxException e){e.getMessage();}
		}
	}
	/*in web u can't search a sentence with space in it >server won't understand
	so all the space(s) are converted to '+'*/
	public static String string_search_in_web(String hell){
      String well;
     if(hell.contains(" "))
     	well=hell.replace(' ','+');
     else
     	well=hell;
     return well;
	}
}