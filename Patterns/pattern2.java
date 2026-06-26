/*

1 
0 0 
1 1 1 
0 0 0 0 
1 1 1 1 1 


*/

package Patterns;

public class pattern2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || i == 3 || i == 5) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
}
