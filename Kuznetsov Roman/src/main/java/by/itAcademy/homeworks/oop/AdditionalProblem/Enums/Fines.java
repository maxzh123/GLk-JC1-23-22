package by.itAcademy.homeworks.oop.AdditionalProblem.Enums;

public enum Fines {
    E41("Парковка в неправильном месте"),
    E42("Езда без прав");
    private String reason;
    Fines(String reason){
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
}
