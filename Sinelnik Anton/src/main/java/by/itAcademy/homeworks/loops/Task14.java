package by.itAcademy.homeworks.loops;

/** Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
 */

public class Task14 {
    public static void main(String[] args) {
        long x = 7_893_823_445L;
        int sum = 0;
        do {
            sum+=x%10;
            x/=10;
        }while (x != 0);
            System.out.println(sum);
        }
    }
