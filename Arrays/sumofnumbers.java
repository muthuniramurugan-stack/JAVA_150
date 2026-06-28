//Sum of the numbers upto a single digit
package Arrays;

public class sumofnumbers {
    public static void main(String[] args) {
        int num = 1234;
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            num = sum;
        }
        System.out.println(num);
    }
}
