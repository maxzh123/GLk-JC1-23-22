package by.itAcademy.homeworks.oop.AdditionalProblem;

//Класс кассира служит здесь примером использования интерфейса
public class Person implements Ipayer {
    @Override
    public boolean getPayment(int payment, int price) {
        return payment >= price;
    }
}
