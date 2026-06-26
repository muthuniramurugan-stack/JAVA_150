package Strings;

public class Valididentifier {
    public static void main(String[] args) {
          String str = "student_1";
        boolean valid = true;
        char ch = str.charAt(0);
        if (!((ch >= 'A' && ch <= 'Z') ||
              (ch >= 'a' && ch <= 'z') ||
              ch == '_' || ch == '$')) {
            valid = false;
        }
        for (int i = 1; i < str.length(); i++) {
            ch = str.charAt(i);
            if (!((ch >= 'A' && ch <= 'Z') ||
                  (ch >= 'a' && ch <= 'z') ||
                  (ch >= '0' && ch <= '9') ||
                  ch == '_' || ch == '$')) {
                valid = false;
                break;
            }
        }
        if (valid) {
            System.out.println("Valid Identifier");
        } else {
            System.out.println("Invalid Identifier");
        }
    }
}
