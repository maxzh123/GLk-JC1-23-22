package by.itAcademy.homeworks.types;

/** Задание 4
    Написать метод, который принимает на вход два целых числа, делает их суммирование и складывает результат с произведением
    двух этих чисел, и возвращает полученный результат из метода. Передать на вход в метод любые два числа.
    Вывести полученный результат работы метода на экран
 */

public class Task4 {
    //метод для вычисления
    static  int calculation (int a, int b){
        int result = (a + b) + (a * b);
        return result;
    }
    //в метод для вычисления передаются значения переменных (a, b), выводится результат (c)
    public static void main (String[] args) {
        int c = calculation (2,3);
        System.out.println(c);
    }
}