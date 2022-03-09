package by.itAcademy.homeworks.operators;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {

    /** Написать метод, который выводит расписание на неделю.
     *  Задать на вход в метод порядковый номер дня недели и отобразить на экране то, что запланировано на этот день
     */
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day of the week: ");
        int  dayNumber= in.nextInt();
        System.out.println(dayPlan(dayNumber));
    }

    public static String  dayPlan(int day){
            String [] arrPlanWeek = {"Work", "Study", "Workout", "Meeting with friends", "Swimming pool", "Meeting with parents", "Journey" , "Rest"};
            String day_str = "";
            switch (day){
                case 1:
                    day_str = "You've planned: " + arrPlanWeek[0];
                    break;
                case 2:
                    day_str = "You've planned: " + arrPlanWeek[1];
                    break;
                case 3:
                    day_str = "You've planned: " + arrPlanWeek[2];
                    break;
                case 4:
                    day_str = "You've planned: " + arrPlanWeek[3];
                    break;
                case 5:
                    day_str = "You've planned: " + arrPlanWeek[4];
                    break;
                case 6:
                    day_str = "You've planned: " + arrPlanWeek[5];
                    break;
                case 7:
                    day_str = "You've planned: " + arrPlanWeek[6];
                    break;
                default:
                return "Error: enter correct number";

            }
            String planWeek = Arrays.toString(arrPlanWeek);
            return "Your plan of the week: " +"\n" + "Monday: "  + arrPlanWeek[0] + ";" +"\n" + "Tuesday: " + arrPlanWeek[1]+ ";"
                    +"\n" + "Wednesday: " + arrPlanWeek[2]+ ";" +"\n" + "Thursday: "
                    + arrPlanWeek[3]+";" +"\n" + "Friday: " + arrPlanWeek[4]+";" +"\n" + "Saturday: " + arrPlanWeek[5]+";"+"\n" +
                    "Sunday: "+ arrPlanWeek[6]+"." +
                    "\n" + "Today:" + day_str + ".";
        }
}



