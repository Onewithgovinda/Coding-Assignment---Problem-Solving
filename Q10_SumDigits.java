import java.util.Scanner;

public class Q10_SumDigits {
    static int sumDigits(long n) {
        if (n == 0) return 0;
        return (int)(n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(sumDigits(n));
    }
}
