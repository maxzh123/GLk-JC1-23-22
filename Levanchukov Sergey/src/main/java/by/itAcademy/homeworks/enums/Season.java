package by.itAcademy.homeworks.enums;

public enum Season {
    WINTER("Зима снежная",90),
    SPRING("Весна теплая",92),
    SUMMER("Лето жаркое",92),
    AUTUMN("Очень дождливая",91);

    private final String description;
    private int countOfDays;


    Season(String description,int countOfDays){
        this.description=description;
        this.countOfDays=countOfDays;
    }

    public String getDescription(){
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    /*Сделал через метод name потому что метод toString у меня переопределен по другому и возвращает не совсем то что требуется по заданию*/
    public static String getNextSeason(Season season){
        switch (season){
            case WINTER:
                return SPRING.name();
            case SPRING:
                return SUMMER.name();
            case SUMMER:
                return AUTUMN.name();
            case AUTUMN:
                return WINTER.name();
        }
        return null;
    }

    @Override
    public String toString() {
        return description;
    }
}
