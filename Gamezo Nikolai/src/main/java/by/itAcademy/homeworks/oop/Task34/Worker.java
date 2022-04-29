package by.itAcademy.homeworks.oop.Task34;

public class Worker implements SalaryCalculation{
    private float salary;
    private float hoursWorked;
    private int numberOfPartsProduced;
    private float partPrice;
    private float wage;
    private float workingHoursPerMonth = 176;

    public Worker(float salary,float hoursWorked,int numberOfPartsProduced, float partPrice) {
        this.salary = salary;
        this.hoursWorked = hoursWorked;
        this.numberOfPartsProduced = numberOfPartsProduced;
        this.partPrice = partPrice;
    }

    @Override
    public float salaryCalculation() {
        wage = salary * (hoursWorked / workingHoursPerMonth) + numberOfPartsProduced * partPrice;
        return wage;
    }
    public String toString() {
        return "Рабочему начислено: " + wage;
    }
}
