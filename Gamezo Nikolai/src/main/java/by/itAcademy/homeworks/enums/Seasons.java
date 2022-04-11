package by.itAcademy.homeworks.enums;

public enum Seasons {
    WINTER(90, "Зима"),
    SPRING(92, "Весна"),
    SUMMER(92, "Лето"),
    AUTUMN(91, "Осень");

    private int countOfDays;
    private String description;

    Seasons(int countOfDays, String description) {
        this.countOfDays = countOfDays;
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public int getCountOfDays() {
        return countOfDays;
    }
    public static String informationOutput(Seasons season) {
        return "Сезон: " + season + " Описание: " + season.getDescription() + " Количество дней: " + season.getCountOfDays();
    }
}

