import java.util.Scanner;

public class B2029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt(), r = scanner.nextInt(), ans = 0;

        double v = h * (3.14 * r * r) / 1000;


        if(20 % v == 0)
            ans = (int) (20 / v);
        else 
            ans = (int) (20 / v + 1);

        System.out.println(ans);
        
        scanner.close();
    }
}
