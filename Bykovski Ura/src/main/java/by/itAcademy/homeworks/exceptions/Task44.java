package by.itAcademy.homeworks.exceptions;

//Написать собственное исключение от Exception.
//Сгенерировать код, который будет выбрасывать его и обрабатывать.
//Результат работы программы вывести на экран.

public class Task44 {
    public static void main(String[] args){
        try {
            throw new MyExeption("Ошибка");
        } catch (MyExeption e) {
            e.printStackTrace();
        }
        System.out.println("Оно работает");
    }
}
