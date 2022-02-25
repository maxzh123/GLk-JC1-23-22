package by.itAcademy.homeworks.operators;
import java.util.Scanner;

/**Задать целое число в виде переменной, это число – сумма денег в рублях.
 Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        if (sum %10 == 1){
            System.out.println(sum + " рубль");
        } else if (sum % 10 == 2 || sum % 10 == 3 || sum % 10 == 4 ){
            System.out.println(sum + " рубля");
        } else{
            System.out.println(sum + " рублей");
        }
    }
}
