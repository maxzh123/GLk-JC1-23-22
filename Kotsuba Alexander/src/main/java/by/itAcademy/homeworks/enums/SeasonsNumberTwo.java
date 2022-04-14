package by.itAcademy.homeworks.enums;

public enum SeasonsNumberTwo {
    Summer,Autumn,Winter,Spring;

    static String getNextSeason(String season){
        switch (season){
            case "Winter":
                System.out.println("Next season is a Spring");
                break;
            case "Spring" :
                System.out.println("Next season is a Summer");
                break;
            case "Summer":
                System.out.println("Next season is an Autumn");
                break;
            case "Autumn":
                System.out.println("Next season is a Winter");
                break;
            default:
                System.out.println("Incorrect season");
                break;
        }
        return season;
    }
}
