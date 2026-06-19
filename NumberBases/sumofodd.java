public class sumofodd {
    public static void main(String[] args) {
        int num = 12345678;
        int oddsum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                oddsum += digit;
            }
            num /= 10;
        }
        System.out.println(oddsum);
    }
}
