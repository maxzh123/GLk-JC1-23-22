package by.itAcademy.homeworks.oop;

public class Handyman extends AbstractWorker{
    public Handyman(String position,String name){
        this.position = position;
        this.name = name;
    }

    @Override
    public void getSalary() {
        super.bonus = 1000;
        super.coef = 1.1;
        System.out.println("Зарплата: " + (salary * coef + bonus));
    }

    @Override
    public void work() {
        System.out.println("Работая тоже отдыхает");;
    }

    @Override
    public void lunchTime() {
        System.out.println("Кушает вкусно,кушает много");;
    }
}
