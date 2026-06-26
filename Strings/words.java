// to count number of words in a string
package Strings;

public class words {
    public static void main(String[] args) {
        String name = "muthu";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            count++;
        }
        System.out.println(count);
    }
}
