// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner inputScan = new Scanner(System.in);
        int inputNumber = inputScan.nextInt();
        int inputNumber1 = inputNumber;
        int sum = 0, res = 1;
        while (inputNumber >= 0) {
            sum += inputNumber;
            inputNumber--;
        }
        while (inputNumber1 >= 1) {
            res *= inputNumber1;
            inputNumber1--;
        }

        System.out.println("sum = " + sum);
        System.out.print("factorial = " + res);

        inputScan.close();

    }

}