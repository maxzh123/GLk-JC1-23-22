package by.itAcademy.homeworks.oop.forTask34;

public class Master extends DeputyForProduction implements SalaryCalculation{
    public Master(float salary, float hoursWorked, float premium, float planCompletionPercentage) {
        super(salary, hoursWorked, premium, planCompletionPercentage);
    }
}
