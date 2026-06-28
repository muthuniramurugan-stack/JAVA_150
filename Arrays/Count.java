//Count total positives, negatives and zeros from an array
package Arrays;

public class Count {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, -1, -2, -3, 0, 0, 2, 0 };
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 1) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }
}
