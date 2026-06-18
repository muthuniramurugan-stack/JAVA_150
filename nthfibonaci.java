public class nthfibonaci {
    public static void main(String[] args) {
        int n = 6;
        int num1 = 0;
        int num2 = 1;
        if (n == 0) {
            System.out.println(num1);
        } else if (n == 1) {
            System.out.println(num2);
        } else {
            int fib = 0;
            for (int i = 2; i <= n; i++) {
                fib = num1 + num2;
                num1 = num2;
                num2 = fib;
            }

            System.out.println(fib);
        }
    }
}
