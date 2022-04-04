package by.itAcademy.homeworks.enums;

/**
 * Создать enum, который описывает сезоны года. Добавить поле description в
 * этот enum. Добавить поле countOfDays в этот enum. Вывести на экран все константы
 * сезоны года.
 *
 *
 */
public enum Seasons {
    WINTER(90), SPRING(92), SUMMER(92), AUTUMN(91);


    private int daysCount;
    private int description;

    Seasons(int daysCount ) {
        this.daysCount = daysCount;
    }

    public int getDaysCount() {
        return daysCount;
    }
    public void nextMonth(Seasons seasons){
        switch (seasons){
            case AUTUMN:
                System.out.println(WINTER); break;
            case SPRING:
                System.out.println(SUMMER);break;
            case SUMMER:
                System.out.println(AUTUMN);break;
            case WINTER:
                System.out.println(SPRING);break;

        }

    }
}
