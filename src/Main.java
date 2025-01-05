import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = readInt();

        while (true) {
            char operation = scanner.next().charAt(0);

            switch (operation) {
                case '+', '-', '*', '/', '^':
                    int operand2 = readInt();
                    operand1 = calculate(operand1, operation, operand2);
                    System.out.println(operand1);
                    break;
                case 'C':
                    operand1 = readInt();
                    break;
                case 's':
                    return;
                default:
                    System.out.println("Unsupported operation. Try again");
            }
        }
    }

    private static int calculate(int operand1, char operation, int operand2) {
        return switch (operation) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> operand1 / operand2;
            case '^' -> (int)Math.pow(operand1, operand2);
            default -> 0;
        };
    }

    private static int readInt() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("You must enter whole number. Try again");
            return readInt();
        }
    }
}