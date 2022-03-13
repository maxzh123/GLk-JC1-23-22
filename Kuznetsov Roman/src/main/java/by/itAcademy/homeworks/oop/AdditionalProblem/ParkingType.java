package by.itAcademy.homeworks.oop.AdditionalProblem;

public enum ParkingType {
    OPEN("Парковка под открытым небом"),
    CLOSED("Парковка под землей");

    private final String description;

    ParkingType(String description ){
        this.description =description;
    }

    public String getDescription(){
        return description;
    }
}
