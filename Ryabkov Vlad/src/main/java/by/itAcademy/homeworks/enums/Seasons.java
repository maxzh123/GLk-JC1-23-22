package by.itAcademy.homeworks.enums;

/**
 * Создать enum, который описывает сезоны года. Добавить поле description в
 * этот enum. Добавить поле countOfDays в этот enum. Вывести на экран все константы
 * сезоны года.
 *
 *
 */
public enum Seasons {
    WINTER(90,"Холодно"), SPRING(92,"Тепло"), SUMMER(92,"Жарко"), AUTUMN(91,"Прохладно");

private int daysCount;
private String description;

    public int getDaysCount() {
        return daysCount;
    }

    public String getDescription() {
        return description;
    }

    Seasons(int daysCount, String description) {
        this.daysCount = daysCount;
        this.description = description;
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
