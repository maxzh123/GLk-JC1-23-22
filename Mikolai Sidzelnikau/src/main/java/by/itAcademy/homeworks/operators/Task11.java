package by.itAcademy.homeworks.operators;

import java.util.Scanner;

/**## Задание 11
 > Написать метод, который выводит расписание на неделю. Задать на вход в
 > метод порядковый номер дня недели и отобразить на экране то, что запланировано
 > на этот день.*/
public class Task11 {
    public static void main(String[] args) {
        System.out.println("Введите число месяца и мы посмотрим что там запланированно");
        Scanner scanner =new Scanner(System.in);
        int sum = scanner.nextInt();
        String[] week = {"Понедельник","Вториник","Среда","Четверг","Пятница","Субота","Воскресенье"};
        String[] schedule = {"День тяжёлый лучше не чего не делай","Сходить в магазин","Топить баню","Посмотреть фильм","Купить пива","Попить пиво","Купить по крепче пива"};
        String schedule1;
        String week1;
     int[] month = new int[31];
     int sum1 = 0;
     for (int s=0;s< month.length;s++){
         month[s] = s +1; // выводим числа от 1 до 31
         sum1 = month[s]; // Присваиваю числа из масива в переменную
         if (sum == sum1){
             sum1 = month[s];
             System.out.println("Вы ввели число"+" "+ sum1); // вывожу введенное число и присвоенное число из масива
         } //Ввыводим веденное число из масива
 //       System.out.println(month[sum1]);
     } //заполнил масив чслом от 1 до 31 и выводим введенное число из масива
     for (int s =0;s< week.length;s++){
          week1 = week[s];
     } // присвоение с масива недели
        if (sum <= 7){
            week1 = week[sum -1];
            System.out.println("Первая неделя"+" "+ week1);
        }else if (sum<=14){
            sum = sum -7;
            week1 = week[sum - 1];
            System.out.println("Вторая неделя"+" "+ week1);
        }else if (sum<=21) {
            sum = sum - 14;
            week1 = week[sum - 1];
            System.out.println("Третья неделя"+" "+ week1);
        }else if (sum<=28) {
            sum = sum - 21;
            week1 = week[sum - 1];
            System.out.println("Четвертая неделя"+" "+ week1);
        }else if (sum<=35) {
            sum = sum - 28;
            week1 = week[sum - 1];
            System.out.println("Пятая неделя"+" "+ week1);
        } // условия для всего месяца
     for (int s = 0;s<schedule.length;s++){
         schedule1 = schedule[s];
     } //присваение с масива расписаний
        if (sum<=7){
            schedule1 = schedule[sum -1];
            System.out.println(schedule1);
        }else if (sum<=14){
            sum = sum - 7;
            schedule1 = schedule[sum -1];
            System.out.println(schedule1);
        }else if (sum <=21){
            sum = sum -14;
            schedule1 = schedule[sum -1];
            System.out.println(schedule1);
        }else if (sum <=28){
            sum = sum -21;
            schedule1 = schedule[sum -1];
            System.out.println(schedule1);
        }else if (sum<35){
            sum = sum -28;
            schedule1 = schedule[sum -1];
            System.out.println(schedule1);
        } // условия для всего месяца
    } // я знал как легко сделать неделю от 0 до 7 но как сделать например от 14 до 21 поэтому сделал график на месяц
    }
