package by.itAcademy.homeworks.enums;

public enum Season {
    WINTER(90),
    SPRING(92),
    SUMMER(92),
    AUTUMN(91);

    Season(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    private String description;
    private int countOfDays;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public void setCountOfDays(int countOfDays) {
        this.countOfDays = countOfDays;
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
