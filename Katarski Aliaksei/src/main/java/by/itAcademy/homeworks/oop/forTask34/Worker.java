package by.itAcademy.homeworks.oop.forTask34;

public class Worker {
    private String name;
    private String position;
    private int startSalary;
    private Currency salaryCurrency;


    public Worker(String name, String position, int startSalary, Currency salaryCurrency) {
        this.name = name;
        this.position = position;
        this.startSalary = startSalary;
        this.salaryCurrency = salaryCurrency;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getStartSalary() {
        return startSalary;
    }

    public Currency getSalaryCurrency() {
        return salaryCurrency;
    }
}
