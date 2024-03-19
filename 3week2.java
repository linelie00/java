import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            n = scanner.nextInt();
            if (n > 18 || n < 1)
                System.out.print("-1\n");
            else break;
        }

        for (int i = n; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
