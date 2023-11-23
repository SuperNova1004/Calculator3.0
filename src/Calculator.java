import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String result1 = nextLine();
        String[] stringArray = result1.split(" ");
        String firstNum = stringArray[0];
        String operand = stringArray[1];
        String secondNum = stringArray[2];
        int i = Integer.parseInt(firstNum);
        int o = Integer.parseInt(secondNum);
        if (result1.length() > 7 || result1.length() < 5) {
            throw new RuntimeException("Выражение некорректно");
        }
        if (i < 1 || i > 10) {
            throw new RuntimeException("Вы ввели некорректное число");
        }
        if (o < 1 || o > 10) {
            throw new RuntimeException("Вы ввели некорректное число");
        }
        int result = calc(i, o, operand);
        System.out.println("Результат операции: " + result);
    }
    public static int calc(int operand1, int operand2, String operation) {
        int result = 0;
        switch (operation) {
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
                result = operand1 / operand2;
                break;
            default:
                throw new RuntimeException("Вы ввели некорректное арифметическое действие");
        }
        return result;
    }
    public static String nextLine() {
        System.out.print("Введите выражение: ");
        String operand = null;
        if (scanner.hasNextLine()) {
            operand = scanner.nextLine();
        }
        return operand;
    }
}