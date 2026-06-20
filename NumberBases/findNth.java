// to find the nth (target element) in the number
public class findNth {
    public static void main(String[] args) {
        // method 01
        int num = 12345;
        String temp = num + "";
        int n = 4;
        for (int i = 0; i < temp.length(); i++) {
            if (i == n - 1) {
                System.out.println(temp.charAt(i));
            }
        }
    }
}

/*
  Method 2
  int num = 12345;
  String temp = num+"";
  int n =4;
  System.out.println(temp.charAt(n-1));
 */
