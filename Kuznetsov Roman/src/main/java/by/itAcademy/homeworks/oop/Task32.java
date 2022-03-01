package by.itAcademy.homeworks.oop;

import java.util.Date;

class Appliance {
    protected String producer;
    protected double weigth;
    protected Date prodtime;
    protected String serialnumber;
    public String isTurnedOn(){
        return "Makes some action";
    }
    public Appliance(String producer, double weigth, Date prodtime, String serialnumber) {
        this.producer = producer;
        this.weigth = weigth;
        this.prodtime = prodtime;
        this.serialnumber = serialnumber;
    }
}
class CoolingAppliance extends Appliance {
    protected double electricityRequired;
    @Override
    public String isTurnedOn() {
        return "Freezes";
    }
    public CoolingAppliance(String producer, double weigth, Date prodtime, String serialnumber, double electricityRequire) {
        super(producer, weigth, prodtime, serialnumber);
        this.electricityRequired = electricityRequire;
    }
}
class Fridge extends CoolingAppliance {
    protected String formfactor;
    @Override
    public String isTurnedOn() {
        return "Protects food";
    }
    public Fridge(String producer, double weigth, Date prodtime, String serialnumber, double electricityRequire, String formfactor) {
        super(producer, weigth, prodtime, serialnumber, electricityRequire);
        this.formfactor = formfactor;
    }
}
public class Task32 {
    public static void main(String[] args) {
        Appliance a = new Appliance("Bosh",12,new Date(),"AE123THC");
        CoolingAppliance b = new CoolingAppliance("Bosh",12,new Date(),"AE123THC",220);
        Fridge c = new Fridge("Bosh",12,new Date(),"AE123THC",220,"Mini");
        System.out.println("Appliance: "+a.isTurnedOn());
        System.out.println("CoolingApplication "+b.isTurnedOn());
        System.out.println("Fridge "+c.isTurnedOn());
    }
}
