import java.util.Scanner;

public class P5704 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);

        System.out.println(Character.toChars(a - 32)[0]);

        scanner.close();
    } 
}