import java.util.Scanner;

public class Q19_CountCharacter {
    static int count(String s, char c, int index) {
        if (index == s.length()) return 0;
        return (s.charAt(index) == c ? 1 : 0) + count(s, c, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        System.out.println(count(s, c, 0));
    }
}
