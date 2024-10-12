import java.util.Scanner;

public class P1421 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), b = scanner.nextInt(), c = 0, ans = 0;

        c = a * 10 + b;

        ans = c / 19;

        System.out.println(ans);

        scanner.close();
    }
}
