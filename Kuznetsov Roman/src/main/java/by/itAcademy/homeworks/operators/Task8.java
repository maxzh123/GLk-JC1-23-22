package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task8 {
    static String rubOutput(int num){
        int preLastDigit = num % 100 / 10;
        if (preLastDigit == 1)
        {
            return "рублей";
        }
        switch (num % 10)
        {
            case 1:
                return "рубль";
            case 2:
            case 3:
            case 4:
                return "рубля";
            default:
                return "рублей";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rub = scanner.nextInt();
        System.out.format("Сумма: %d %s",rub,rubOutput(rub));
    }
}
