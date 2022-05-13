package by.itAcademy.homeworks.generics;

public class Garage <T extends Vehicle>{
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
