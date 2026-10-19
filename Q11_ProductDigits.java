import java.util.Scanner;

public class Q11_ProductDigits {
    static long productDigits(long n) {
        if (n == 0) return 0;
        if (n < 10) return n;
        return (n % 10) * productDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(productDigits(n));
    }
}
