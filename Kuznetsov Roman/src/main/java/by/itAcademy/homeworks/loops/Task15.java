package by.itAcademy.homeworks.loops;
import static by.itAcademy.homeworks.basics.IsPrimeChallange.isPrime;

/**
 * В данном классе происходит нахождение второго простого числа из диапозона 50...70.
 * Так же импортирован метод и базовых заданий для экономии времени и нервов.
 */
public class Task15 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 50; i < 70; i++) {
            if(isPrime(i))
                count++;
            if(count==2){
                System.out.println("Второе число:" + i);
                break;
            }
        }

    }
}
