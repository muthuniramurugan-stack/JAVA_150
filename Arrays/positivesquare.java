package Arrays;

public class positivesquare {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum = sum + (arr[i] * arr[i]);
            }
        }
        System.out.println(sum);
    }
}
