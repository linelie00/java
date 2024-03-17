import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (x1>200||x2<100||y1>200||y2<100) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
