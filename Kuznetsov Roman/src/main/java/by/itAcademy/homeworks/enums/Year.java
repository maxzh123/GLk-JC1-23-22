package by.itAcademy.homeworks.enums;
enum Seasons{
    WINTER("Мороз, очень холодно, идёт снег",90),
    SPRING("Теплеет, снег тает",92),
    SUMMER("Жарко, но созревают ягоды и фрукты, все счастливы",92),
    AUTUMN("дождливо и пасмурно",91);

    private final String description;
    private int countOfDays;

    Seasons (String description, int countOfDays){
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription(){
        return description;
    }

    public int getCountOfDays(){
        return countOfDays;
    }

    public static void plusOneDayForWinter(){
        if (WINTER.countOfDays == 90)
            WINTER.countOfDays++;
    }

    public static String displayingInfoAboutSeason(Seasons season){
        return "Season: "+season+" Description: "+season.getDescription()+" Days: "+season.getCountOfDays();
    }

    public static Seasons getNextSeason(Seasons season){
        switch (season) {
            case WINTER:
                return  SPRING;
            case SPRING:
                return  SUMMER;
            case SUMMER:
                return  AUTUMN;
            case AUTUMN:
                return  WINTER;

        }
        return null;
    }

    public static int getCountOfDaysInSeason(Seasons season) {
        switch (season) {
            case WINTER:
                return WINTER.countOfDays;
            case SPRING:
                return  SPRING.countOfDays;
            case SUMMER:
                return  SUMMER.countOfDays;
            case AUTUMN:
                return  AUTUMN.countOfDays;
        }
        return 0;
    }
}
