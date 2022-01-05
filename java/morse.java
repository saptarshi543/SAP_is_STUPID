import java.util.*;

public class morse2 {
    static String characters[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
            "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
    static String morse[] = { ". _", "_ . . .", "_ . _ .", "_ . .", ".", ". . _ .", "_ _ .", ". . . .", ". .",
            ". _ _ _", "_ . _", ". _ _ _", "_ _", "_ .", "_ _ _", ". _ _ .", "_ _ . _", ". _ .", ". . .", "_", ". . _",
            ". . . _", ". __", "_ . . _", "_ . _ _", "_ _ . .", ". _ _ _ _", ". ._ _ _", ". . . _ _", ". . . . _",
            ". . . . .", "_ . . . .", "_ _ . . .", "_ _ _ . .", "_ _ _ _ .", "_ _ _ _ _" };
    static String space_between_words = "       ";// 7 blank units
    static String space_between_letters = "   "; // 3 blank units

    public static String remove_space_in_front(String n) {
        return n.substring(1);
    }

    public static String morse_to_normal(String n1) {
        String n = remove_space_in_front(n1);
        String final_ans = "";
        int count = 0;
        String words[] = n.split(space_between_words);
        /*
         * //uncomment to see the program separate the words and letters
         * for (int i = 0; i < words.length; i++) {
         * System.out.println(i + "word" + words[i]);
         * }
         * for (String tmp : words) {
         * String letters[] = tmp.split("   ");
         * for (String tmp2 : letters) {
         * System.out.println("letter" + tmp2);
         * }
         * }
         */

        for (int i = 0; i < words.length; i++) {
            String letters[] = words[i].split("   ");

            for (String tmp_letter : letters) {
                for (String tmp : morse) {
                    if (tmp == tmp_letter) {
                        System.out.println("inside if");//test 
                        final_ans += characters[count];
                        count++;
                        break;
                    }
                    count++;
                }
            }
            final_ans += " ";
        }

        return final_ans;
    }

    public static String normal_to_morse(String n) {
        return ">>" + n;
    }

    public static void main(String d[]) {
        // driver code
        Scanner nrt = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "1: morse to normal\n2:normal to morse\n3: exit\n   enter information like this\n  1 <space > message");
            int user_choice = nrt.nextInt();
            String tmp;
            switch (user_choice) {
                case 1:
                    tmp = nrt.nextLine();
                    System.out.println(morse_to_normal(tmp));
                    break;
                case 2:
                    tmp = nrt.nextLine();
                    System.out.println(normal_to_morse(tmp));
                    break;
            }
            if (user_choice == 3) {
                break;
            }
        }
        nrt.close();
    }
}
