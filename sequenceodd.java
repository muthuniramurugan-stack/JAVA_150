// in a sequence of number we need to find the odd numbers
public class sequenceodd {
    public static void main(String[] args) {
        int num = 12345;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                System.out.println("The Number " + digit + " :Is Odd");
            }
            num /= 10;
        }
        
    }
}
