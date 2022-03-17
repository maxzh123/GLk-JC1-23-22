package by.itAcademy.homeworks.loops;

public class Task12 {
    /**
     * Вычислить факториал целых чисел от 0 до 10 с помощью цикла while
     */

public static void main(String[] args){
    int numb = 1;
    int factorial =1;
    while (numb<11){
        factorial *= numb;
        System.out.println(numb + " - "+ factorial);
        numb++;
    }
}
}
