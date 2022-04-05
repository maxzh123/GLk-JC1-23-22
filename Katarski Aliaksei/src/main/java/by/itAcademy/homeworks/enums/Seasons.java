package by.itAcademy.homeworks.enums;

public enum Seasons {

    SUMMER(92,"Summer"),WINTER(91,"Winter"),AUTUMN(91,"Autumn"),SPRING(92,"Spring");

    private int dayCount;
    private String description;
    Seasons(int dayCount,String description) {
        this.dayCount = dayCount;
        this.description=description;
    }

    public int getDayCount() {
        return dayCount;
    }

    public String getDescription() {
        return description;
    }
    public static int getSumOfDays(Seasons seasons){
        int sumOfDays=0;
        for(int i=0;i<= seasons.dayCount;i++){
            sumOfDays+=i;
        }
        System.out.println("сумма дней "+ sumOfDays);
        return sumOfDays;
    }

    public static Seasons getNextSeason(Seasons seasons){
        switch (seasons){
            case SUMMER:
                return SPRING;
            case WINTER:
                return AUTUMN;
            case AUTUMN:
                return WINTER;
            case SPRING:
                return SUMMER;
        }
        return null;
    }

}


