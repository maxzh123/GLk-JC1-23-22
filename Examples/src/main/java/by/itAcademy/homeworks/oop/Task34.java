package by.itAcademy.homeworks.oop;

public class Task34 {
    public static void main(String[] args) {
        Garage<Велосипед> гаражДляВелосипедиков=new Garage<>();
        Garage<Ковер> гаражДляКовра=new Garage<>();
        Garage<ТранспортноеСредство> гараж=new Garage<>();
        Garage<Object> сарай=new Garage<>();

        гараж.putInto(new Велосипед());
        гараж.putInto(new Автомобиль());
        гараж.putInto(new Ковер());
    }
}
