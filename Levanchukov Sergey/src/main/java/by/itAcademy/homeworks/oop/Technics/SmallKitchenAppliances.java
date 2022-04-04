package by.itAcademy.homeworks.oop.Technics;

public class SmallKitchenAppliances extends KitchenAppliances{

    public void saySmall(){
        System.out.println("Я мелкий поставь меня где-нибудь!");
    }

    public SmallKitchenAppliances(String name, int age, String manufacturer, int serialNumber) {
        super(name, age, manufacturer, serialNumber);
    }
}
