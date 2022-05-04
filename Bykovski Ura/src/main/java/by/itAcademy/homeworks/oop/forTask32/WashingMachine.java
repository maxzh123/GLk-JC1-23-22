package by.itAcademy.homeworks.oop.forTask32;

public class WashingMachine extends householdAppliances{
    public float maxLoad;
    public int spinSpeed;
    public float depth;

    public WashingMachine(float price, String manufacturer, String model, float maxLoad, int spinSpeed, float depth){
        super(price, manufacturer, model);
        this.maxLoad=maxLoad;
        this.spinSpeed=spinSpeed;
        this.depth=depth;
    }

    public WashingMachine() {
        super();
    }

    public float getMaxLoad(){
        return maxLoad;
    }

    public int getSpinSpeed(){
        return spinSpeed;
    }

    public float getDepth(){
        return depth;
    }

    public void wash(){
        if(whatState()) System.out.println("Стирает");
        else System.out.println("Включите");
    }

    @Override
    public String toString() {
        return "WashingMashine(" +
                "price=" + getPrice() +
                ", manufacturer=" + getManufacturer() +
                ", model=" + getModel()  +
                ", state=" + getState() +
                ", maxLoad=" + maxLoad +
                ", spinSpeed=" + spinSpeed +
                ", depth=" + depth +
                ")";
    }
}
