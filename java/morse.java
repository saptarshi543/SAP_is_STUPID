import java.util.*;

public class morse2 {
    public static String morse_to_normal(String n) {
        return ">>" + n;
    }

    public static String normal_to_morse(String n) {
        return ">>" + n;
    }

    public static void main(String d[]) {
        Scanner nrt = new Scanner(System.in);
        char characters[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R','S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
        String morse[] = { ". _", "_ . . .", "_ . _ .", "_ . .", ".", ". . _ .", "_ _ .", ". . . .", ". .", ". _ _ _","_ . _", ". _ _ _", "_ _", "_ .", "_ _ _", ". _ _ .", "_ _ . _", ". _ .", ". . .", "_", ". . _",". . . _", ". __", "_ . . _", "_ . _ _", "_ _ . .", ". _ _ _ _", ". ._ _ _", ". . . _ _", ". . . . _",". . . . .", "_ . . . .", "_ _ . . .", "_ _ _ . .", "_ _ _ _ .", "_ _ _ _ _" };
        String space_between_words = "       ";// 7 blank units
        String space_between_letters = "   "; // 3 blank units
        System.out.println(morse_to_normal("n"));
        System.out.println(normal_to_morse("n"));
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
        // nrt.close();
    }
}
