package by.itAcademy.homeworks.oop;

import by.itAcademy.homeworks.oop.Technics.BigKitchenAppliances;
import by.itAcademy.homeworks.oop.Technics.SmallKitchenAppliances;

/**
 * > Создать цепочку наследования (минимум 3 звена) классов, описывающих
 * > бытовую технику. Создать несколько объектов описанных классов, часть из них
 * > включить в розетку. Иерархия должна иметь хотя бы три уровня.
 **/

public class Task32 {
    public static void main(String[] args) {

        SmallKitchenAppliances toaster=new SmallKitchenAppliances("Роберт", 1,"Китайский подвал",1);
        System.out.println("Маленький тостер по имени: "+toaster.getName()+". Так как мне: "+ toaster.getAge()+
                        " год, гаранитии осталось не так уж и много. " + "Мой серийный номер: "+ toaster.getSerialNumber()+", первый и последний в своем роде!");
        toaster.saySmall();
        toaster.setPower("Пожалуй у меня отпуск");
        System.out.println(toaster.getPower());

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

        BigKitchenAppliances fridge=new BigKitchenAppliances("Семен", 2,"Аристократичный европейский завод",3);
        System.out.println("Умный холодильник по имени: "+fridge.getName()+". Мне уже: "+ toaster.getAge()+
                " года, гаранития расширена. " + "Мой серийный номер: "+ fridge.getSerialNumber());
        fridge.sayBig();
        fridge.setPower("Работаю как и всегда");
        System.out.println(fridge.getPower());

    }
}
