public class stepping {
    public static void main(String[] args) {
        int num = 12345;
        int res = 0;
        String temp = num + "";
        for (int i = 0; i < temp.length() - 1; i++) {
            int diff = temp.charAt(i) - temp.charAt(i + 1);
            if (diff < 0) {
                diff = -diff;
            }
            if (diff == 1) {
                res++;
            }
        }
        if (res == temp.length() - 1) {
            System.out.println("Stepping");
        } else {
            System.out.println("Not a Stepping");
        }
    }
}
