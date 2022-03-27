package by.itAcademy.homeworks.generics;

public class Garage <T extends Vehicle> {

    private T item;

    public void putInto(T o){
        item = o;
    }

    public T qetFrom(){
        return item;
    }


}
