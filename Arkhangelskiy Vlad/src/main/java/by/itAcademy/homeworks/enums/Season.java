package by.itAcademy.homeworks.enums;

public enum Season {

    SUMMER(93, "Лето"),
    FALL(92, "Осень-осень"),
    WINTER(89, "Зима"),
    SPRING(90, "Весна");

    private final int countOfDays;
    private final String description;

    Season(int countOfDays, String description) {
        this.countOfDays = countOfDays;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Season{" +
                "countOfDays=" + countOfDays +
                ", description='" + description + '\'' +
                '}';
    }

    public static Season getNextSeason(Season season){

        if (season.equals(Season.SPRING)){
            return Season.SUMMER;

        } else if (season.equals(Season.SUMMER)){
            return Season.FALL;

        } else if (season.equals(Season.FALL)){
            return Season.WINTER;

        }else if(season.equals(Season.WINTER)){
            return Season.SPRING;
        }
        return null;
    }

    public int getCountOfDays() {
        return countOfDays;
    }
}
