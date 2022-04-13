package by.itAcademy.homeworks.enums;

public enum Seasons {
    WINTER("first season", 90),
    SPRING("second season", 92),
    SUMMER("third season", 92),
    AUTUMN("fourth season", 91);

    private String description;
    private int countOfDays;

    Seasons(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public static Seasons getNextSeason(Seasons seasons) {
        switch (seasons) {
            case WINTER:
                return SPRING;
            case SPRING:
                return SUMMER;
            case SUMMER:
                return AUTUMN;
            case AUTUMN:
                return WINTER;
        }
        return null;
    }
}
