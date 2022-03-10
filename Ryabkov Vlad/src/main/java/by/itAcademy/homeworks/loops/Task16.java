package by.itAcademy.homeworks.loops;

/**
 * Для чисел в пределах от 1 до 100, которые делятся на 7 вывести строку "Hope!"
 */

public class Task16 {
    public static void main(String[] args) {
        int value1 = 1;
        int value2  = 100;
        int numb = 7;
        String str = "Hope!";
        search(value1,value2, numb, str);


    }
    public static void search (int value1, int value2, int numb, String str){
        for (int i = value1; i <=value2; i++) {
            if (i % numb == 0){
                System.out.println(i + " " + str);
            }

        }
    }
}
