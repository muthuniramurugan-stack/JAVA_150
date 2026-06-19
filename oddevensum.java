public class oddevensum {
    public static void main(String[] args) {
        int num = 123456789;
        int oddsum = 0;
        int evensum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evensum += digit;
            } else {
                oddsum += digit;
            }
            num /= 10;
        }
        System.out.println("ODDSUM: " + oddsum);
        System.out.println("EVENSUM: " + evensum);
    }
}
