package by.itAcademy.homeworks.oop.forTask34;

public class Supervisor extends Engineer {
    public Supervisor(String position, String name){
        this.position = position;
        this.name = name;

    }

    @Override
    public String toWork() {
        return "Пытается казаться серьезным руководителем, хотя тот еще клоун";
    }

    @Override
    public double getSallary() {
        super.bonus = 2000;
        super.increaseCoefficient = 4.89;
        return super.getSallary();
    }
}
