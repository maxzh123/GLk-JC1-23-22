package by.itAcademy.homeworks.loops;

/**Вычислить произведение чисел от 1 до 25 с помощью цикла do while.*/
public class Task13 {
    public static void main(String[] args) {
        int x=25; int a=1;
        do {
        a*=x;
        x--;
        }while (x >= 1);
        System.out.println("Произведение чисел " + a);
    }
}
