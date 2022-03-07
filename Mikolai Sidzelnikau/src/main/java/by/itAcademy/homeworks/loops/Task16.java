package by.itAcademy.homeworks.loops;

/**
 * ## Задание 16
 * > Для целых чисел, которые делятся на 7 в диапазоне от 1 до 100, вывести на
 * > экран строку “Hope!”.
 */
public class Task16 {
    public static void main(String[] args) {
        String r = "Hope!";
        int s = 0;
        while (s <= 100){
            if (s % 7==0){
                System.out.println(s +" " + r);
            }
            s++;
        }
    }
}
