public class sequenceeven {
    public static void main(String[] args) {
        int num = 12345;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                System.out.println("The Number" + digit + ":Is Even");
            }
            num /= 10;
        }

    }
}
