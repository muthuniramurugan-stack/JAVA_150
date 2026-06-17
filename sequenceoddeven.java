public class sequenceoddeven {
    public static void main(String[] args) {
        int num = 123456;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                System.out.println("The Number " + digit + "Is Even");
            } else {
                System.out.println("The Number" + digit + "Is Odd");
            }
            num /= 10;
        }
    }
}
