package by.itAcademy.homeworks.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task11Test {

    @Test
    void getWeekScheduleTest() {
        String expectedDay1 = "Понедельник: рабочий день";
        String expectedDay6 = "Суббота: выходной день";
        String expectedDay8 = "Неверное значение";

        String actualDay1 = Task11.getWeekSchedule(1);
        String actualDay6 = Task11.getWeekSchedule(6);
        String actualDay8 = Task11.getWeekSchedule(8);

        assertEquals(expectedDay1, actualDay1);
        assertEquals(expectedDay6, actualDay6);
        assertEquals(expectedDay8, actualDay8);
    }
}