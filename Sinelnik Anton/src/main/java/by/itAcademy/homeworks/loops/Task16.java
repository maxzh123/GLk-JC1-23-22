package by.itAcademy.homeworks.loops;

/**
 * Для целых чисел, которые делятся на 7 в диапазоне от 1 до 100, вывести на экран строку “Hope!”.
 */

public class Task16 {
    public static void main(String[] args) {
       hope(1,100);
    }
    public static void hope (int start, int end){
        for (int i = start; i <= end ; i++) {
            if (i % 7 == 0) {
                System.out.println("int " + i + " Hope!");
            }
        }
    }
}
