package by.itAcademy.homeworks.oop;

public abstract class AbstractWorker implements Salary{
    public String name;
    public static final double salary = 500;
    public double workingHours,standartHours;
    public String position;
    public double bonus;
    public double coef;


    public void getSalary(){
        double totalSalary = (salary * coef + bonus) * (workingHours / standartHours);
        System.out.printf("Зарплата: %.2f%n",totalSalary);
    }

    public void work(){
        System.out.println("Челик работает");
    }

    public void lunchTime(){
        System.out.println("Челик отдыхает");
    }

    public void getInfo(){
        System.out.println("Сотрудник: " + name + ", должность: " + position);
    }
}
