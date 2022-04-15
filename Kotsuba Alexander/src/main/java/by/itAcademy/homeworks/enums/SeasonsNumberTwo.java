package by.itAcademy.homeworks.enums;

public enum SeasonsNumberTwo {
    Summer,Autumn,Winter,Spring;

    public void getNextSeason(SeasonsNumberTwo season){
        switch (season){
            case Summer:
                System.out.println(Autumn);
                break;
            case Autumn:
                System.out.println(Winter);
                break;
            case Winter:
                System.out.println(Spring);
                break;
            case Spring:
                System.out.println(Summer);
                break;
            default:
                System.out.println("Incorrect season");
                break;
        }
    }
}
