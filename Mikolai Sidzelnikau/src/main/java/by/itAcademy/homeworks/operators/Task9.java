package by.itAcademy.homeworks.operators;
/**## Задание 9
        > Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату
        > следующего дня.*/
public class Task9 {
    private int day;
    private int month;
    private int year;

    public Task9(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void getNextDay() {
        getDay();
        System.out.println("Следущий день: "+day + "\\" + month + "\\" + year);
    }

    public int getDay() {
        setDay(day);
        return day;
    }

    private void setDay(int day) {
        if (day == YANUARY || day == MARCH || day == MAY || day == JULY ||
                day == AUGUST || day == OCTOBER || day == DECEMBER) {
            if (month == 1 || month == 3 || month == 5 ||
                    month == 7 || month == 8 || month == 10 || month == 12) {
                day = 1;
                setMonth(month);
                this.day = day;
            }
        } else if (day != 31 || day != 30 || day != 28) {
            this.day = day + 1;
        }
        if (day == APRIL || day == JUNE || day == SEPTEMBER || day == NOVEMBER) {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                day = 1;
                setMonth(month);
                this.day = day;
            }
        }
        if (day == FEBRUARY) {
            if (month == 2) {
                day = 1;
                setMonth(month);
                this.day = day;
            }
        }
    }

    private void setMonth(int month) {
        month += 1;
        this.month = month;
    }

    @Override
    public String toString() {
        return "Task9{" +
                "day=" + getDay() +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
    public static final int YANUARY = 31;
    public static final int FEBRUARY = 28;
    public static final int MARCH = 31;
    public static final int APRIL = 30;
    public static final int MAY = 31;
    public static final int JUNE = 30;
    public static final int JULY = 31;
    public static final int AUGUST = 31;
    public static final int SEPTEMBER = 30;
    public static final int OCTOBER = 31;
    public static final int NOVEMBER = 30;
    public static final int DECEMBER = 31;
}
