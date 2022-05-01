package by.itAcademy.homeworks.oop.forTask34;

public class PurshaseManager extends Worker implements GetSalary{
    private int salePlan;
    private int planExecution;
    private double allowance;

    public PurshaseManager(String name, String position, int startSalary, Currency salaryCurrency, int salePlan, int planExecution, double allowance) {
        super(name, position, startSalary, salaryCurrency);
        this.salePlan = salePlan;
        this.planExecution = planExecution;
        this.allowance = allowance;
    }

    @Override
    public double getSalary() {
        if(planExecution<=salePlan){
            return getStartSalary();
        }else{
            System.out.println("Перевыполнил план и получил: "+getStartSalary()*allowance+" "+Currency.BYN.getDescription());
            return getStartSalary()*allowance;
        }
    }
}
