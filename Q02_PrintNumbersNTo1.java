import java.util.Scanner;

public class Q02_PrintNumbersNTo1 {
    static void printNumbers(int n) {
        if (n == 0) return;
        System.out.print(n + (n == 1 ? "" : " "));
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(n);
        System.out.println();
    }
}
