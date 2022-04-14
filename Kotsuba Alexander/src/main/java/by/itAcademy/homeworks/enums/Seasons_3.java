package by.itAcademy.homeworks.enums;

public enum Seasons_3 {
    Summer(92),
    Autumn(91),
    Winter(90),
    Spring(91);
    private final int countOfDays;

    Seasons_3(int countOfDays) {
        this.countOfDays = countOfDays;
    }
    int getCountOfDays(){
        return countOfDays;
    }
}
