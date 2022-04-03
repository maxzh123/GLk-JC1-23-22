package by.itAcademy.homeworks.enums;
import by.itAcademy.homeworks.helper.strScanner;

public class Task36 {

    /**Task36
     * Написать метод, который выводит следующий сезон от заданного во входном параметре.
     * Входной параметр ввести с клавиатуры.
     */

    public static void main(String[] args) {
        strScanner str = new strScanner();
        getNextMonth(str.strEnter());
    }

    public static void getNextMonth(String x){
        Seasons seasons = Seasons.valueOf(x.toUpperCase());
        seasons.nextMonth(seasons);
    }
}
