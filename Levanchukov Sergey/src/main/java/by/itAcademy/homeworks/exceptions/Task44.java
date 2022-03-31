package by.itAcademy.homeworks.exceptions;

/**
 * > Написать собственное исключение от Exception. Сгенерировать код, который
 * > будет выбрасывать его и обрабатывать. Результат работы программы вывести на
 * > экран.
 **/

public class Task44 {
    public static void main(String[] args) throws Exception {
        firstTry();
        System.out.println("Hello");
    }

    public static void firstTry() throws Exception{
        try {
            throw new ArrayIndexOutOfBoundsException("Выход за размер массива");
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

}
