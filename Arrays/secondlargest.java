package Arrays;

public class secondlargest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int lar = arr[0];
        int slar = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lar) {
                slar = lar;
                lar = arr[i];

            }
        }
        System.out.println("The Second Largest Element Is:" + slar);
    }
}
