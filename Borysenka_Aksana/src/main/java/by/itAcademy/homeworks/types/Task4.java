package by.itAcademy.homeworks.types;

/** task4
Написать метод, который принимает на вход два целых числа, делает их суммирование и складывает результат с произведением двух этих чисел,
и возвращает полученный результат из метода. Передать на вход в метод любые два числа. Вывести полученный результат работы метода на экран
 **/

public class Task4 {
    //создаем метод для вычисления
    static int method(int a, int b) {
        int с = (a+b)+ (a*b);
        return с;
    }
    // передаем в метода 2 числа и выводим на экран результат
    public static void main (String[] arg) {
    int rez = method(5,2);
    System.out.println(rez);
    }
}



