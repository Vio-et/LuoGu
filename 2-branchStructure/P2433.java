import java.util.Scanner;

public class P2433 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        switch (a) {
            case 1:
                System.out.println("I love Luogu!\n");
                break;
            case 2:
                System.out.println("6 4\n");
                break;
            case 3:
                System.out.println("3\n12\n2\n");
                break;
            case 4:
                System.out.printf("%.3f\n", 500.0 / 3);
                break;
            case 5:
                System.out.printf("%d\n", 480 / 32);
                break;
            case 6:
                System.out.printf("%.4f\n", Math.sqrt(36 + 81));
                break;
            case 7:
                System.out.println("110\n90\n0\n");
                break;
            case 8:
                double PAI = 3.141593;
                System.out.printf("%.4f\n%.4f\n%.3f\n", 2 * PAI * 5, PAI * 25, 4.0 / 3 * PAI * 125);
                break;
            case 9:
                System.out.println("22\n");
                break;
            case 10:
                System.out.println("9\n");
                break;
            case 11:
                System.out.printf("%.4f\n", 100.0 / 3);
                break;
            case 12:
                System.out.println("13\nR\n");
                break;
            case 13:
                double PI = 3.1415923;
                System.out.printf("%.0f\n", Math.pow(4016 * PI / 3, 1.0 / 3));
                break;
            case 14:
                System.out.println("50\n");
                break;
            default:
                break;
        }

        scanner.close();
    }
}
