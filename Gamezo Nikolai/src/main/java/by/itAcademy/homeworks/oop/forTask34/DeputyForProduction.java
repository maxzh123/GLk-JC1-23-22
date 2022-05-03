package by.itAcademy.homeworks.oop.forTask34;

public class DeputyForProduction implements SalaryCalculation {
    private float salary;
    private float hoursWorked;
    private float premium;
    private float planCompletionPercentage;
    private float wage;
    private float workingHoursPerMonth = 176;

    public DeputyForProduction(float salary, float hoursWorked, float premium, float planCompletionPercentage) {
        this.salary = salary;
        this.hoursWorked = hoursWorked;
        this.premium = premium;
        this.planCompletionPercentage = planCompletionPercentage;
    }

    @Override
    public float salaryCalculation() {
        wage = salary * (hoursWorked / workingHoursPerMonth) + premium * (planCompletionPercentage / 100);
        return wage;
    }

    public String toString() {
        return "Заместителю начальника цеха по производству начислено: " + wage;
    }
}