import java.util.*;
import java.lang.Object;
public class morse {
    static String space_between_words = "       ";// 7 blank units
    static String space_between_letters = "   "; // 3 blank units
    public static String remove_space_in_front(String n) {
        return n.substring(1);
    }

    public static String morse_to_normal(String n, Dictionary database) {
        // working....
        String n1=remove_space_in_front(n);
        String final_ans="";
        String[] split_into_words=n1.split(space_between_words);
        for (int t=0;t<split_into_words.length;t++){
            String[] split_into_letters=split_into_words[t].split(space_between_letters);
        for(String tmp_letter:split_into_letters){
            try{
                final_ans+=database.get(tmp_letter);
            }catch(Exception e){
                // do nothing...
            }
    }
    final_ans+=" ";
    }
    try{
        final_ans=final_ans.replace("null"," ");
    }catch(Exception e){
        // do nothing..
    }
        return final_ans;
    }

    public static String normal_to_morse(String n, Dictionary database) {
        // working...
        String final_ans="";
        String n1=remove_space_in_front(n);
        int len_of_string=n1.length();
        for(int itr=0;itr<len_of_string;itr++){
            String tmp_letter=""+n1.charAt(itr);
            final_ans+=(tmp_letter==" ")?"    ":(database.get(tmp_letter)+space_between_letters);
        }
        try{
            final_ans=final_ans.replace("null","");
        }
        catch(Exception e){
            // do nothing...
        }
        return final_ans;
    }

    public static void main(String d[]) {
        // driver code

         String characters[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
        "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
 String morse[] = { ". _", "_ . . .", "_ . _ .", "_ . .", ".", ". . _ .", "_ _ .", ". . . .", ". .",
        ". _ _ _", "_ . _", ". _ _ _", "_ _", "_ .", "_ _ _", ". _ _ .", "_ _ . _", ". _ .", ". . .", "_", ". . _",
        ". . . _", ". __", "_ . . _", "_ . _ _", "_ _ . .", ". _ _ _ _", ". ._ _ _", ". . . _ _", ". . . . _",
        ". . . . .", "_ . . . .", "_ _ . . .", "_ _ _ . .", "_ _ _ _ .", "_ _ _ _ _" };



        Scanner nrt = new Scanner(System.in);
        Dictionary<String ,String> database1=new Hashtable<String ,String>();
        Dictionary<String ,String> database2=new Hashtable<String ,String>();

        // morse(key) ->  characters(value)
        for (int itr=0;itr<characters.length;itr++){
            database1.put(morse[itr],characters[itr]);
        }

        // characters(key)   -> morse(value)
        for(int itr=0;itr<morse.length;itr++){
            database2.put(characters[itr],morse[itr]);
        }
        while (true) {
            System.out.println(
                    "1: morse to normal\n2:normal to morse\n3: exit\n   enter information like this\n  1 <space > message");
            int user_choice = nrt.nextInt();
            String tmp;
            switch (user_choice) {
                case 1:
                    tmp = nrt.nextLine();
                    System.out.println(morse_to_normal(tmp,database1));
                    break;
                case 2:
                    tmp = nrt.nextLine();
                    System.out.println(normal_to_morse(tmp.toUpperCase(),database2));
                    break;
            }
            if (user_choice == 3) {
                break;
            }
        }
        nrt.close();
    }
}
