package by.itAcademy.homeworks.oop.Technics;

public class BigKitchenAppliances extends KitchenAppliances{

    public void sayBig(){
        System.out.println("Ладно ставь на меня мелкого!");
    }

    public BigKitchenAppliances(String name, int age, String manufacturer, int serialNumber) {
        super(name, age, manufacturer, serialNumber);
    }
}
