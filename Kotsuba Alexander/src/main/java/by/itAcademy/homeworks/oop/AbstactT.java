package by.itAcademy.homeworks.oop;

public abstract class AbstactT implements Abilities{
    public boolean isOn = false;
    public String name;
    public String model;
    public int year;

    public void switchOn(){
        System.out.println("Техника включена");
        isOn = true;
    }

    public void switchOff(){
        System.out.println("Техника выключена");
        isOn = false;
    }

    public void printInfo(){
        System.out.println("Название: " + name + " ,модель: " + model + ", год выпуска: " + year);
        System.out.println();
        isOn();
        System.out.println();
    }

    private void isOn(){
        if(this.isOn){
            System.out.println("Техника включена в розетку");
        }else {
            System.out.println("Техника не включена в розетку");
        }
    }
}
