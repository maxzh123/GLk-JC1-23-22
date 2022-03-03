package by.itAcademy.homeworks.loops;
/**
 > Для целых чисел, которые делятся на 7 в диапазоне от 1 до 100, вывести на
 > экран строку “Hope!”.
 */
public class Task16 {
    public static void main(String[] args) {
        for (int i = 7; i < 100; i+=7) { //зачем проходить 100 итераций, если можно их не делать?
            System.out.format("I: %d, HOPE!\n",i);
        }
    }
}
