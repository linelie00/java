import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        float operand1 = scanner.nextFloat();
        String operator = scanner.next();
        float operand2 = scanner.nextFloat();

        float result;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("False");
                    return;
                }
                result = operand1 / operand2;
                break;
            default:
                return;
        }

        System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
    }
}
