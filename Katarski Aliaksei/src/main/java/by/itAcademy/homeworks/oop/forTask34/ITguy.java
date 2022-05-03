package by.itAcademy.homeworks.oop.forTask34;

public class ITguy extends Worker implements GetSalary{
    private long minNumberOfKeystroke;
    private long currentNumberOfKeystroke;
    private int bonus;

    public ITguy(String name, String position, int startSalary, Currency salaryCurrency, long minNumberOfKeystroke, long currentNumberOfKeystroke, int bonus) {
        super(name, position, startSalary, salaryCurrency);
        this.minNumberOfKeystroke = minNumberOfKeystroke;
        this.currentNumberOfKeystroke = currentNumberOfKeystroke;
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public double getSalary() {
        if(currentNumberOfKeystroke>minNumberOfKeystroke){
            System.out.print("Постучал по клавиатуре и получил: ");
            System.out.println(getStartSalary()+getBonus()+" "+Currency.USD.getDescription());
            System.out.println();
        }
        return getStartSalary()+getBonus();

    }
}

