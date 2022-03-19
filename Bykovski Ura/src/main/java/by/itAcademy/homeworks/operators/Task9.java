package by.itAcademy.homeworks.operators;

import java.util.Scanner;

//Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.
//Пусть в месяце постоянно 30 дней
public class Task9 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int day=sc.nextInt();
        int month=sc.nextInt();
        int year=sc.nextInt();
        if (day>=30) {
            day = 1;
            month+=1;
            if (month >= 13) {
                month = 1;
                year += 1;
            }
        }
        else {
            day+=1;
        }
        if (day<10){
            if (month<10){
                System.out.println("0"+day+"."+"0"+month+"."+ year);
            }
            else if (month>=10 ){
                System.out.println("0"+day+"."+month+"."+ year);
            }
        }
        else if (day>=10){
                 if (month<10){
                     System.out.println(day+"."+"0"+month+"."+ year);
                 }
                 else if (month>=10){
                     System.out.println(day+"."+month+"."+ year);
                 }
        }
    }
}
