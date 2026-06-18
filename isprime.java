public class isprime {
    public static void main(String[] args) {
        int num = 2;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not A Prime Number");
        }
    }
}

// method 02
/*
public class IsPrime {
    public static void main(String[] args) {
        int num = 17;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not A Prime Number");
        }
    }
}
*/