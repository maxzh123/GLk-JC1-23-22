package by.itAcademy.homeworks.operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * > Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату
 * > следующего дня.
 */

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите день от 1 до 31 ");
        int day = Integer.parseInt(x.readLine());
        if (day < 1 || day > 31) {
            System.out.println("ОШИБКА!!!  Вы ввели день неверно, попробуте еще раз");
            return;
        }
        System.out.println("Введите месяц от 1 до 12 ");
        int month = Integer.parseInt(x.readLine());
        if (month < 1 || month > 12){
            System.out.println("ОШИБКА!!!  Вы ввели месяц неверно");
            return;
        }
        System.out.println("Введите год ");
        int year = Integer.parseInt(x.readLine());

//февраль
        if (day == 28 && month == 2 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("завтра будет  29 февраля " + year + " года");
        } else if (day >= 1 && day <= 27 && month == 2 && year % 4 != 0) {
            System.out.println("Завтра будет " + (day + 1) + " февраля " + year + " года");
        } else if (day <= 28 && month == 2 && year % 4 != 0) {
            System.out.println("Завтра будет 1 марта" + year);
        }
//март
        if (day >= 1 && day <= 30 && month == 3) {
            System.out.println("Завтра будет " + (day + 1) + " марта " + year + " года");
        } else if (day == 31 && month == 3) {
            System.out.println("Завтра будет 1 апреля" + year + " года");
        }
//апрель
        if (day >= 1 && day <= 29 && month == 4) {
            System.out.println("Завтра будет " + (day + 1) + " мая " + year + " года");
        } else if (day == 30 && month == 4) {
            System.out.println("Завтра будет 1 мая" + year + " года");
        }
//май
        if (day >= 1 && day <= 30 && month == 5) {
            System.out.println("Завтра будет " + (day + 1) + " мая " + year + " года");
        } else if (day == 31 && month == 5) {
            System.out.println("Завтра будет 1 июня" + year + " года");
        }
//июнь
        if (day >= 1 && day <= 29 && month == 6) {
            System.out.println("Завтра будет " + (day + 1) + " июня " + year + " года");
        } else if (day == 30 && month == 6) {
            System.out.println("Завтра будет 1 июля" + year + " года");
        }
//июль
        if (day >= 1 && day <= 30 && month == 7) {
            System.out.println("Завтра будет " + (day + 1) + " марта " + year + " года");
        } else if (day == 31 && month == 7) {
            System.out.println("Завтра будет 1 августа" + year + " года");
        }
//август
        if (day >= 1 && day <= 30 && month == 8) {
            System.out.println("Завтра будет " + (day + 1) + " марта " + year + " года");
        } else if (day == 31 && month == 8) {
            System.out.println("Завтра будет 1 сентября" + year + " года");
        }
//сентябрь
        if (day >= 1 && day <= 29 && month == 9) {
            System.out.println("Завтра будет " + (day + 1) + " марта " + year + " года");
        } else if (day == 30 && month == 9) {
            System.out.println("Завтра будет 1 октября" + year + " года");
        }
//октябрь
        if (day >= 1 && day <= 29 && month == 10) {
            System.out.println("Завтра будет " + (day + 1) + " ноября " + year + " года");
        } else if (day == 30 && month == 10) {
            System.out.println("Завтра будет 1 ноября" + year + " года");
        }
//ноябрь
        if (day >= 1 && day <= 29 && month == 11) {
            System.out.println("Завтра будет " + (day + 1) + " ноября " + year + " года");
        } else if (day == 30 && month == 11) {
            System.out.println("Завтра будет 1 декабря" + year + " года");
        }
//декабрь
        if (day >= 1 && day <= 30 && month == 12) {
            System.out.println("Завтра будет " + (day + 1) + " декабря " + year + " года");
        } else if (day == 31 && month == 12) {
            System.out.println("Завтра будет 1 января" + year + " года");
        }
//январь
        if (day >= 1 && day <= 30 && month == 1) {
            System.out.println("Завтра будет " + (day + 1) + " января " + year + " года");
        } else if (day == 31 && month == 1) {
            System.out.println("Завтра будет 1 февраля" + year + " года");
        } else System.out.println("ОШИБКА!!!" + " " + " Введите корректную дату");
    }
}
