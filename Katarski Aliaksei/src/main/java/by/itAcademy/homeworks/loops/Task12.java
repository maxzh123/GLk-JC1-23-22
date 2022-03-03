package by.itAcademy.homeworks.loops;
/**Вычислить факториал целых чисел от 0 до 10 с помощью цикла while
*/

public class Task12 {
    public static void main(String[] args){
        int factorial=1;
        int i=1;
        while(i<=10){
            factorial*=i;
            i++;
            System.out.println(factorial);
        }
    }
}



