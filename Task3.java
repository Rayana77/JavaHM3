package homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){

        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        number = scanner.nextInt();

        int sum = (number&10)+((number/10)%10)+((number/100)&10);
        System.out.println("Сумма введенного числа " + sum);
    }
}
