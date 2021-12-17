import java.util.*;
public class morse{
    public static String morse_to_normal(String n){
        String final_ans="";
        return final_ans;
    }
    public static String normal_to_morse(String n2,String [] morse,char [] characters){
   String final_ans="";

   return final_ans;
    }
    public static void main(String f[]){
        Scanner nrt=new Scanner(System.in);
        morse M=new morse();
        char characters[]={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','1','2','3','4','5','6','7','8','9','0'};
        String morse[]={". _","_ . . .","_ . _ .","_ . .",".",". . _ .","_ _ .",". . . .",". .",". _ _ _","_ . _",". _ _ _","_ _","_ .","_ _ _",". _ _ .","_ _ . _",". _ .",". . .","_",". . _",". . . _",". __","_ . . _","_ . _ _","_ _ . .",". _ _ _ _",". ._ _ _",". . . _ _",". . . . _",". . . . .","_ . . . .","_ _ . . .","_ _ _ . .","_ _ _ _ .","_ _ _ _ _"};
        System.out.println("hello there!!!!");
        /*
        space between words = "       "{7 blank units}
        space between letters   - " " {one unit}
         I        -  ". ."
         O        -  "_ _ _"
         U        -  ". . _"
         B        -  "_ . . ."
         C        -  "_ . _ ."
         D        -  "_ . ."
         F        -  ". . _ ."
         G        -  "_ _ ."
         H        -  ". . . ."
         J        -  ". _ _ _"
         A        -  ". _"
         K        -  "_ . _"
         E        -  "." 
         L        -  ". _ . ."
         M        -  "_ _"
         N        -  "_ ."
         P        -  ". _ _ ."
         Q        -  "_ _ . _"
         R        -  ". _ ."
         S        -  ". . ."
         T        -  "_"
         V        -  ". . . _"
         X        -  "_ . . _"
         Z        -  "_ _ . ."
         W        -  ". _ _"
         Y        -  "_ . _ _"
         1        -  ". _ _ _ _"
         2        -  ". . _ _ _"
         3        -  ". . . _ _"
         4        -  ". . . . _"
         5        -  ". . . . ."
         6        -  "_ . . . ."
         7        -  "_ _ . . ."
         8        -  "_ _ _ . ."
         9        -  "_ _ _ _ ."
         0        -  "_ _ _ _ _"
         */
                
        /*
        //just fo testing...uncomment to see it....
        for(int i=0;i<(36);i++){
            System.out.println(characters[i]+"  >>  "+morse[i]);
        }*/


        while(true){
            System.out.println("1-normal message to morse code\n2-morse code to normal message\n3-exit");
            int tmp=nrt.nextInt();
            if(tmp==1){System.out.println("enter your message");String tmp_user=nrt.nextLine();
            System.out.println(normal_to_morse(tmp_user,morse,characters));
            }
            else if(tmp==2){System.out.println("enter morse code with proper spacing"); String tmp_user_morse=nrt.nextLine();
            System.out.println(morse_to_normal(tmp_user_morse));}
            else if(tmp==3){System.exit(0);}
        }
    nrt.close();
    }
}
