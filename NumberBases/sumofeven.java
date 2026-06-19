public class sumofeven {
    public static void main(String[] args) {
        int num = 12345678;
        int evensum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evensum += digit;
            }
            num /= 10;
        }
        System.out.println(evensum);
    }
}
