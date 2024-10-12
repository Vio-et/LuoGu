import java.util.Scanner;
public class B2005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.next().charAt(0);

        System.out.printf("  %c  \n", a);
        System.out.printf(" %c%c%c \n", a, a, a);
        System.out.printf("%c%c%c%c%c\n", a, a, a, a, a);

        scanner.close();
    }
}
