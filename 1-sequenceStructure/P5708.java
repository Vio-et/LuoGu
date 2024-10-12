import java.util.Scanner;

public class P5708 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble(), ans = 0;
        double p = (a + b + c) / 2;

        double tmp = Math.sqrt(p * (p - a));
        ans = Math.sqrt((p - b) * (p - c));

        ans *= tmp;

        System.out.printf("%.1f\n", ans);

        scanner.close();
    }
}
