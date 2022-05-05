package by.itAcademy.homeworks.enums;

public enum Seasons {
    WINTER("Холодно, скользко",90),
    SPRING("Тепло, шашлычки",92),
    SUMMER("Жарко, можно ничего не делать",92),
    AUTUMN("Пасмурно",91);

    public String description;
    public int countOfDays;

    Seasons(String description, int countOfDays){
        this.description=description;
        this.countOfDays=countOfDays;
    }

    public String getDescription(){return description;}
    public int getCountOfDays(){return countOfDays;}
    public static void getConstantOfSeasons(Seasons season){
        System.out.println(" Season " + season + ", description " + season.getDescription() + ", days " + season.getCountOfDays());
    }

    public static Seasons getNextSeason(Seasons season){
        switch (season){
            case AUTUMN:
                return WINTER;
            case WINTER:
                return SPRING;
            case SPRING:
                return SUMMER;
            case SUMMER:
                return AUTUMN;
        }
        return null;
    }
}
