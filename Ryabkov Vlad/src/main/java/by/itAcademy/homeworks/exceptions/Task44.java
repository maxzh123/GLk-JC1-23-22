package by.itAcademy.homeworks.exceptions;

/**
 * Написать собственное исключение от Exception. Сгенерировать код, который
 *  будет выбрасывать его и обрабатывать. Результат работы программы вывести на
 *  экран.
 */
public class Task44 {
    static class Factorial {
        public static int getFactorial(int num) throws FactorialException {

            int result = 1;
            if (num < 1) throw new FactorialException("The number is less than 1", num);

            for (int i = 1; i <= num; i++) {

                result *= i;
            }
            return result;
        }
    }
    public static void main(String[] args){

        try{
            int result = Factorial.getFactorial(6);
            System.out.println(result);
        }
        catch(FactorialException ex){

            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }
}




