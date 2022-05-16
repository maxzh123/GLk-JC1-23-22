package by.itAcademy.homeworks.enums;


public enum Season {
    WINTER(90),
    SPRING(92),
    SUMMER(92),
    AUTUMN(91);
        Season(int countOfDays){this.countOfDays = countOfDays; this.description = description;}
    private int countOfDays;
    private String description;
    public String getDescription() {
        return description;
    }
    public int getCountOfDays() {
        return countOfDays;
    }
    public static Season nextSeason(Season season) {
        switch (season) {
            case AUTUMN:
                return WINTER;
            case SPRING:
                return SUMMER;
            case SUMMER:
                return AUTUMN;
            case WINTER:
                return SPRING;
        }
        return null;
    }
}
