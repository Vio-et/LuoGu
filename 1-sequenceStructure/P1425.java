import java.util.Scanner;

public class P1425 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), d = scanner.nextInt(), seconds = 0;

        seconds = (c - a) * 60 + d - b;

        System.out.printf("%d %d\n", seconds / 60, seconds % 60);

        scanner.close();
    }
}
