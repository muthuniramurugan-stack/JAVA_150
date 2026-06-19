public class sequencefibonacci {
    public static void main(String[] args) {
        int n = 8;
        int num1 = 0;
        int num2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(num1);
            int fib = num1 + num2;
            num1 = num2;
            num2 = fib;
        }
    }
}
