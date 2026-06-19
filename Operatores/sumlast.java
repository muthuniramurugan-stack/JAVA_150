// adding last digits of two numbers
public class sumlast {
    public static void main(String[] args) {
        int n1 = 12345;
        int n2 = 54321;
        int last1 = n1 % 10; 
        int last2 = n2 % 10;
        int total = last1 + last2;
        System.out.println(total);
    }
}
