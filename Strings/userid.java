package Strings;

public class userid {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        int year = 2004;
        char f1 = firstName.charAt(0);
        char f2 = firstName.charAt(1);
        char l1 = lastName.charAt(lastName.length() - 2);
        char l2 = lastName.charAt(lastName.length() - 1);
        String userId = "" + f1 + f2 + l1 + l2 + year;
        System.out.println("Generated User ID: " + userId);
    }
}
