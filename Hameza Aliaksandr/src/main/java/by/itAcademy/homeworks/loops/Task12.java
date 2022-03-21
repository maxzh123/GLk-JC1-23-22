package by.itAcademy.homeworks.loops;
/**
 * Задание 12
 * Вычислить факториал целых чисел от 0 до 10 с помощью цикла while
 */
public class Task12 {
    public static void main(String[] args) {
        int a = 2;
        int factorial = 2;
        while (a <= 10){
            factorial = factorial * a;
            a++;
        }
     System.out.println("Факториал = " + factorial);}
}
