package by.itAcademy.homeworks.enums;

public enum Seasons {
    Summer(92,"Лето"),
    Autumn(91,"Осень"),
    Winter(90,"Зима"),
    Spring(92,"Весна");

    private int countOfDays;
    private final String description;

    Seasons(int countOfDays, String description) {
        this.countOfDays = countOfDays;
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public int getCountOfDays(){
        return countOfDays;
    }

    public static String getInfo(Seasons seasons){
        return seasons + seasons.getDescription() + seasons.getCountOfDays();
    }
}
