package by.itAcademy.homeworks.operators;
import java.util.Scanner;
/**Написать метод, который выводит расписание на неделю. Задать на вход в метод порядковый номер дня недели и отобразить на экране то, что запланировано на этот день.*/
public class Task11 {
    public static String[] plans = new String[7];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите, что запланировано на Понедельник:");
        plans[0] = sc.nextLine();
        System.out.println("Введите, что запланировано на Вторник:");
        plans[1] = sc.nextLine();
        System.out.println("Введите, что запланировано на Среду:");
        plans[2] = sc.nextLine();
        System.out.println("Введите, что запланировано на Четверг:");
        plans[3] = sc.nextLine();
        System.out.println("Введите, что запланировано на Пятницу:");
        plans[4] = sc.nextLine();
        System.out.println("Введите, что запланировано на Субботу:");
        plans[5] = sc.nextLine();
        System.out.println("Введите, что запланировано на Воскресенье:");
        plans[6] = sc.nextLine();
        System.out.println("Введите порядковый номер дня недели:");
        int day = sc.nextInt();
        schedule(day);
    }
        static void schedule(int i) {
        System.out.println(plans[i-1]);
    }
}
