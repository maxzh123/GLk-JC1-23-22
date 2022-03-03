/*Задать целое число в виде переменной, это число – сумма денег в рублях.
 Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже*/

package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество денег: ");
        int countMoney = sc.nextInt();
        if(countMoney%10==1){
            System.out.println("у вас "+ countMoney + " рубль");
        }else if(countMoney%10>1 && countMoney%10<5){
            System.out.println("у вас "+ countMoney + " рубля");
        }else{
            System.out.println("у вас "+ countMoney + " рублей");
        }
    }
}
