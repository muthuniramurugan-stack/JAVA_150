package Arrays;

public class reverse {
    public static void main(String[] args) {
        // Method 01
        int[] arr = { 1, 2, 3 };
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int nums : arr) {
            System.out.print(nums);
        }
    }
}
// Method 02
/*

int[] arr = {1, 2, 3, 4, 5};
        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }

        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.print("Reversed Array: ");
        for (int num : rev) {
            System.out.print(num + " ");
        }

*/