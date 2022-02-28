package by.itAcademy.homeworks.operators;


import java.util.Scanner;

/** Написать метод, который выводит расписание на неделю. Задать на вход в
 *метод порядковый номер дня недели и отобразить на экране то, что запланировано
 *на этот день.
 **/

public class Task11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String week[]=new String[7];/**Создаем массим на семь дней*/
        for (int i=0;i< week.length;i++)/**Инициализируем массив данными*/
        {
            System.out.println("Введите планы на "+(i+1)+"-й день: ");
            week[i]=sc.nextLine();

        }
        System.out.println("Введите день недели (цифра от 1 до 7), что бы узнать что запланированно ");
        Scanner day = new Scanner(System.in);
        int index=day.nextInt();
        copy(week,index); /**Передеам массив и день недели для вывода данных на экран*/
    }

    private static void copy(String[] week, int index) {/** создаем метод который принимает ссылку на массив*/
        System.out.println("Планы на "+ (index)+"-й день недели: "+week[index-1]);
    }

}
