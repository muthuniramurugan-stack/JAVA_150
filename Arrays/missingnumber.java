package Arrays;

public class missingnumber {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 1, 2, 8, 4, 5 };
        int n = arr.length + 1;
        for (int i = 0; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Missing Number =" + i);
            }
        }
    }
}
