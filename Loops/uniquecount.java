// counts the number of unique digits
public class uniquecount {
    public static void main(String[] args) {
        int num = 12345;
        String n = num + "";
        int ucount = 0;
        for (int i = 0; i < n.length(); i++) {
            int count = 0;
            for (int j = 0; j < n.length(); j++) {
                if (n.charAt(i) == n.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                ucount++;
            }
        }
        System.out.println(ucount);
    }
}
