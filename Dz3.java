import java.util.Scanner;

public class Dz3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число x:"); int x = scanner.nextInt();
        int y = 3;
        double i = Math.pow(x, y);
        System.out.println(i % 10);
    }
}


