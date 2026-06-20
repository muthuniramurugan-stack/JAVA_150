// Sum of Sums of Digits in Cyclic order
//Repeatedly add the digits of a number until it becomes a single digit,
public class sumofsums {
    public static void main(String[] args) {
        int num = 12345;
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
            }
            num = sum;
        }
        System.out.println(num);
    }
}
