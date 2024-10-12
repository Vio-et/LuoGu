import java.util.Scanner;

public class P5705 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble(), ans = 0;
        
        int tmp = (int) (a * 10);
        
        for (int i = 0; i < 4; i++) {
            ans = ans * 10 + (tmp % 10);
            tmp /= 10;
        }
        
        ans /= 1000;

        System.out.println(ans);

        scanner.close();
    }
}
