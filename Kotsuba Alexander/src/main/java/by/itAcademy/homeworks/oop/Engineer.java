package by.itAcademy.homeworks.oop;

public class Engineer extends AbstractWorker{
    public Engineer(String position,String name,double workingHours,double standartHours){
        this.position = position;
        this.name = name;
        this.workingHours = workingHours;
        this.standartHours = standartHours;
    }

    @Override
    public void getSalary() {
        super.bonus = 5000;
        super.coef = 3.5;
        System.out.println("Зарплата : " + (salary * coef + bonus));
    }

    @Override
    public void work() {
        System.out.println("Инженер инженерит работу");;
    }

    @Override
    public void lunchTime() {
        System.out.println("Инженер не отдыхает инженер работает");;
    }
}
