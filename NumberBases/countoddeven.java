public class countoddeven {
    public static void main(String[] args) {
        int num = 1234567;
        int OddCount = 0;
        int EvenCount = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                EvenCount++;
            } else {
                OddCount++;
            }
            num /= 10;
        }
        System.out.println("EvenCount: " + EvenCount);
        System.out.println("OddCount: " + OddCount);
    }
}
