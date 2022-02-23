package by.itAcademy.homeworks.types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*> Написать метод, который принимает на вход два целых числа, делает их
> суммирование и складывает результат с произведением двух этих чисел, и
> возвращает полученный результат из метода. Передать на вход в метод любые два
> числа. Вывести полученный результат работы метода на экран*/
public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1= Integer.parseInt(reader.readLine());
        int number2= Integer.parseInt(reader.readLine());
        System.out.println(sumOfTwoNumbers(number1,number2));;
    }
    static int sumOfTwoNumbers(int a,int b){
        return a+b;
    }
}
