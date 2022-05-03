package by.itAcademy.homeworks.oop.forTask34;

public class Engineer extends Worker {
    public Engineer (String position, String name, double workingHours, double standardHours){
        this.position = position;
        this.name = name;
        this.workingHours = workingHours;
        this.standardHours = standardHours;
    }
    public Engineer (){
        this.position = "Чернорабочий";
        this.name = "John Doe";
        this.workingHours = 40;
        this.standardHours = 15;
    }
    @Override
    public double getSallary() {
        super.increaseCoefficient = 1.89;
        super.bonus = 500;
        return super.getSallary();
    }
    @Override
    public String toWork() {
        return "Усердно работает на благо завода и будущее C# сатанистов";
    }
}

