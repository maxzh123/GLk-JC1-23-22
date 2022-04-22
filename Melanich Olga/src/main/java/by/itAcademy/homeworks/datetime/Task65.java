package by.itAcademy.homeworks.datetime;



import java.time.LocalDate;
import java.time.LocalTime;


/** Задание 65
 * От текущей даты вывести расписание всех встреч, которые происходят еженедельно в 13:00 в течение 2 месяцев.
 */

public class Task65 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate dateInTwoMonths = today.plusMonths(2);

        LocalTime time = LocalTime.now();
        LocalTime specificTime = LocalTime.of(13, 00);

        do {
            System.out.println("Встреча " + specificTime + " " + today);
            today = today.plusWeeks(1);
        }
        while (today.isBefore(dateInTwoMonths));
    }
}
