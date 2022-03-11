package by.itAcademy.homeworks.loops;

import java.util.Arrays;

/**
 * Задание 17
 * Задать произвольное целое число и вывести его в бухгалтерском формате.
 */

public class Task17 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Printer.print("Enter the number: ");
//        int number = in.nextInt();
        int number = 422_675_768;

        int length = getArrayLength(number);
        int[] array = new int[length];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = number % 1000;
            number = number / 1000;
            System.out.print(array[i] + " ");
            // Как вывести нужный результат???
        }
        System.out.println(Arrays.toString(array));
    }

    public static int getArrayLength(int number) {
        int divider = 1000;
        int loopCounter = 1;
        int counter = 0;
        while (loopCounter > 0) {
            loopCounter = number / divider;
            counter++;
            divider *= 1000;
        }
        return counter;
    }
}


//    public static String accountingFormat(int number, int counter) {
//        String str = "";
//        int a = 0;
//        int b = 0;
//        while (b >= counter) {
//            a = number % 1000;
//            number = number / 1000;
//            str = " " + a;
//            b++;
//        }
//        return str;
//    }




//        String s = " ";
//        for (int i = number; i > 999; number  /= 1000) {
//            int a = number % 1000;
//
//
//        }
//        return;
//


//        int lastThreeNumber = 0;
//        while (number > 999) {
//            lastThreeNumber = number % 1000;
//
//        }
//        return lastThreeNumber;



