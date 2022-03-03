/*Вычислить факториал целых чисел от 0 до 10 с помощью цикла while*/

package by.itAcademy.homeworks.loops;

public class Task12 {
    public static void main(String[] args) {
        int factorial = 1;
        int i = 1;
        int num = 10;
        while (i <= num) {
            factorial *= i;
            i++;
            System.out.println("Факториал: " + factorial);
        }
    }
}

