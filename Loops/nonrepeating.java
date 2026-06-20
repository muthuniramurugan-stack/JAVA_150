public class nonrepeating {
    public static void main(String[] args) {
        int num = 12345;
        String n = num + "";
        int nonrep = 0;
        for (int i = 0; i < n.length(); i++) {
            int count = 0;
            for (int j = 0; j < n.length(); j++) {
                if (n.charAt(i) == n.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                nonrep++;
            }
        }
        System.out.println(nonrep);

    }
}
