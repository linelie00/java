import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = scanner.nextInt();

        int[] price = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        String[] priceNames = {"50,000won bill", "10,000won bill", "1,000won bill", "500won coin",
                "100won coin", "50won coin", "10won coin", "1won coin"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < price.length; i++) {
            int count = money / price[i];
            money %= price[i];
            if (count > 0) {
                result.append(count).append(" ").append(priceNames[i]);
                if (count > 1) result.append("(s)");
                result.append("\n");
            }
        }

        System.out.println(result.toString());
    }
}
