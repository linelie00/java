import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char alp;
        char a = 'a';
        while (true) {
            alp = scanner.nextLine().charAt(0);
            if (alp < 'a' || alp > 'z')
                System.out.print("-1\n");
            else break;
        }

        int n = (int)alp - 96;

        for (int i = n; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print(a);
                a++;
            }
            System.out.println();
            a = 'a';
        }
    }
}
