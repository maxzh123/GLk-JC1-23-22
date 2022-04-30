package by.itAcademy.homeworks.oop.forTask34;

public abstract class Worker implements IEmployee {
    protected String name;
    protected static final double salary = 500;       // Оклад
    protected double workingHours, standardHours;     // Отработано часов, норма часов
    protected String position;                        // Должность
    protected double bonus;                           // Премия
    protected double increaseCoefficient;
    @Override
    public String toWork() {
        return null;
    }
    @Override
    public double getSallary() {
        return (salary * increaseCoefficient + bonus) * (workingHours/standardHours);
    }
    @Override
    public String toString() {
        return "Worker: " +
                "name='" + name + '\'' +
                ", position='" + position;
    }
}
