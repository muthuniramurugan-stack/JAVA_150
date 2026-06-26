/*

E D C B A 
D C B A 
C B A 
B A 
A 


*/

package Patterns;

public class pattern10 {
    public static void main(String[] args) {
        int n = 5;
        char start = 'E';
        for (int i = 1; i <= n; i++) {
            char ch = start;
            for (int j = i; j <= n; j++) {
                System.out.print(ch + " ");
                ch--;
            }
            start--;
            System.out.println();
        }
    }
}
