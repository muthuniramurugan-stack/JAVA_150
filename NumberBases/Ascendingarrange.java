public class Ascendingarrange {
    public static void main(String[] args) {
        int num = 12345;
        boolean ascending = true;
        while (num > 9) {
            int last = num % 10;
            int seconlast = (num / 10) % 10;
            if (seconlast > last) {
                ascending = false;
                break;
            }
            num /= 10;
        }
        if (ascending) {
            System.out.println("Ascending");
        } else {
            System.out.println("Descending");
        }
    }
}
