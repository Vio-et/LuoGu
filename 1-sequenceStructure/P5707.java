import java.util.Scanner;

public class P5707 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt(), v = scanner.nextInt();

        int t = (int) (s / (v * 1.0) + 1), sec = 480;

        if (s % v == 0)
            t = (int) (s / (v * 1.0));

        t += 10;

        if(t > 480)
            sec += 24 * 60;

        sec -= t;
        
        System.out.printf("%02d:%02d\n", sec / 60, sec % 60);

        scanner.close();
    }
}
