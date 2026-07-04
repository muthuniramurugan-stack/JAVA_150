import java.util.Scanner;

class findkey {
    static int smalldigit(int num) {
        int min = 9;
        while (num > 0) {
            int digit = num % 10;
            if (digit < min) {
                min = digit;
            }
            num /= 10;
        }
        return min;
    }

    static int largestdigit(int num) {
        int max = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit > max) {
                max = digit;
            }
            num /= 10;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the  Input1");
        int input1 = scan.nextInt();
        System.out.print("Enter the  Input2");
        int input2 = scan.nextInt();
        System.out.print("Enter the  Input3");
        int input3 = scan.nextInt();
        int key = smalldigit(input1)
                + smalldigit(input2)
                + smalldigit(input3)
                + largestdigit(input1)
                + largestdigit(input2)
                + largestdigit(input3);
        System.out.println("Key = " + key);
    }
}