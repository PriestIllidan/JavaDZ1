// Реализовать простой калькулятор (+, -, *, /)
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Number 1: ");
        Scanner inputExp1 = new Scanner(System.in);
        double number1 = inputExp1.nextDouble();
        System.out.println("Arithmetic operation: ");
        String operation = inputExp1.next();
        System.out.println("Number 2: ");
        double number2 = inputExp1.nextDouble();
        String op1 = "+";
        String op2 = "-";
        String op3 = "*";
        String op4 = "/";
        if (operation.equals(op1)) {
            System.out.println(number1 + number2);
        } else if (operation.equals(op2)) {
            System.out.println(number1 - number2);
        } else if (operation.equals(op3)) {
            System.out.println(number1 * number2);
        } else if (operation.equals(op4)) {
            System.out.println(number1 / number2);
        }

        inputExp1.close();

    }

}