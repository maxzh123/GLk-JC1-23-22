package by.itAcademy.homeworks.loops;

/** Для целых чисел, которые делятся на 7 в диапазоне от 1 до 100, вывести на экран строку “Hope!”. */
public class Task16 {
    public static void main(String[] args){
        Seven();
    }
    public static void Seven(){
        for (int i = 7; i <= 100; i+=7){
            System.out.println(i+" Hope!");
        }
    }
}
