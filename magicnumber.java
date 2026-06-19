class magicnumber {
    public static void main(String[] args) {
        int num = 12345;
        int temp = num;
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            num = sum;
        }
        if (num == 1) {
            System.out.println("MagicNumber");
        } else {
            System.out.println("Not A Magic Number");
        }

    }
}