package by.itAcademy.homeworks.oop.forTask34;

public class Loader extends Worker implements GetSalary{
    private int hoursWorked;
    private int minHoursAmount;

    public Loader(String name, String position, int startSalary, Currency salaryCurrency, int hoursWorked, int minHoursAmount) {
        super(name, position, startSalary, salaryCurrency);
        this.hoursWorked = hoursWorked;
        this.minHoursAmount = minHoursAmount;
    }

    @Override
    public double getSalary() {
        if (hoursWorked >= minHoursAmount) {
            System.out.println("Тяжелым трудом заработал : " + getStartSalary() * hoursWorked / minHoursAmount + " " + Currency.BYN.getDescription());
            return getStartSalary() * hoursWorked/minHoursAmount;
        }else{
            System.out.println("Тяжелым трудом заработал : "+getStartSalary()+" "+Currency.BYN.getDescription());
            return getStartSalary();
        }
    }
}
