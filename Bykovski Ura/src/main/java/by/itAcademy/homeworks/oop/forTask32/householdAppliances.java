package by.itAcademy.homeworks.oop.forTask32;

import java.util.Calendar;

public class householdAppliances {
    public householdAppliances(float price, String manufacturer, String model) {
    }

    public class HouseholdApliances{
        public float price;
        public String manufacturer;
        public String model;
        public boolean state;

        public HouseholdApliances(float price, String manufacturer, String model){
            this.price=price;
            this.manufacturer=manufacturer;
            this.model=model;
        }

        public float getPrice() {
            return price;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public String getModel() {
            return model;
        }

        public boolean whatState() {
            return state;
        }

        public void turnOn() {
            state=true;
        }

        public void turnOff(){
            state = false;
        }

        @Override
        public String toString() {
            return "Appliances(" +
                    "price=" + price +
                    ", manufacturer=" + manufacturer +
                    ", model=" + model  +
                    ", state=" + state +
                    ")";
        }
    }
}
