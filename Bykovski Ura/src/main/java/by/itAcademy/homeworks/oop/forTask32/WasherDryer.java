package by.itAcademy.homeworks.oop.forTask32;

public class WasherDryer extends WashingMachine{
    public boolean steamTreatment;
    public boolean dryingByTimer;

    public WasherDryer(float price, String manufacturer, String model, float maxLoad, int spinSpeed, float depth, boolean steamTreatment, boolean dryingByTimer){
        super(price, manufacturer, model, maxLoad, spinSpeed, depth);
        this.steamTreatment=steamTreatment;
        this.dryingByTimer=dryingByTimer;
    }

    public boolean isSteamTreatment(){
        return steamTreatment;
    }

    public boolean isDryingByTimer(){
        return dryingByTimer;
    }

    public void washAndDry(){
        if(whatState()==true) System.out.println("Стирает, а потом высушит");
        else System.out.println("Включите");
    }

    @Override
    public String toString() {
        return "WashingMashine(" +
                "price=" + getPrice() +
                ", manufacturer=" + getManufacturer() +
                ", model=" + getModel() +
                ", state=" + whatState() +
                ", maxLoad=" + getMaxLoad() +
                ", spinSpeed=" + getSpinSpeed() +
                ", depth=" + getDepth() +
                ", steamTreatment=" + isSteamTreatment() +
                ", dryingByTimer=" + isDryingByTimer() +
                ", steamTreatment=" + steamTreatment +
                ", dryingByTimer" + dryingByTimer +
                ")";
    }
}
