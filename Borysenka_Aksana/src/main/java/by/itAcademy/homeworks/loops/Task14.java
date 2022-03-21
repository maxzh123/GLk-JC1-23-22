package by.itAcademy.homeworks.loops;

public class Task14 {
    /**
     * Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
     */

    public static void main(String[] args) {
        long numb = 7893823445L;
        System.out.println(sumDigit(numb));
    }

    public static int sumDigit(long number){
        int sum = 0;
        do {
           sum += number%10;
           number/=10;
        } while (number>0);
        return sum;
    }
}
