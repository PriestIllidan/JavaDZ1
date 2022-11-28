// Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {
        int N = 1000;
        boolean check = true;
        for (int number = 2; number <= N; number++) {
            for (int div = 2; div < number; div++) {
                if (number % div == 0) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                System.out.print(number + ", ");
            } 
            else check = true;
        }
    } 

}