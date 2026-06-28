package Arrays;

public class secondsmallest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int small = arr[0];
        int s_small = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                s_small = small;
                small = arr[i];
            } else if (arr[i] < s_small && arr[i] != small) {
                s_small = arr[i];
            }
        }
        System.out.println("The Second Smallest Element Is:" + s_small);
    }
}
