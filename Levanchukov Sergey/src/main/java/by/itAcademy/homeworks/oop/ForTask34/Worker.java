package by.itAcademy.homeworks.oop.ForTask34;

public class Worker {
    private String name;
    private String Surname;
    private int age;
    private int actualWorkingTime;
    private int standardWorkingTime;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return age;
    }

    public int getActualWorkingTime() {
        return actualWorkingTime;
    }

    public int getStandardWorkingTime() {
        return standardWorkingTime;
    }

    public Worker(String name, String surname, int age, int actualWorkingTime, int standardWorkingTime) {
        this.name = name;
        Surname = surname;
        this.age = age;
        this.actualWorkingTime = actualWorkingTime;
        this.standardWorkingTime = standardWorkingTime;
    }
}
