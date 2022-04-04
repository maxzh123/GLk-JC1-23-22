package by.itAcademy.homeworks.exceptions;

public class Task44 {

    /**Task44
     * Написать собственное исключение от Exception.
     * Сгенерировать код, который будет выбрасывать его и обрабатывать.
     * Результат работы программы вывести на экран.
     */

    public static void main(String[] args) {
        try {
            int primeNumber = PrimeNumber.getPrimeNumber(-2);
            System.out.println(primeNumber);
        }
        catch (MyExceptionPrimeNumber ex){
            System.out.println(ex.getNumber() + " " + ex.getMessage());
        }

    }
}
