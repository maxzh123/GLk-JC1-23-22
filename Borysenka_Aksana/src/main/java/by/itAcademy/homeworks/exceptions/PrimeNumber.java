package by.itAcademy.homeworks.exceptions;

public class PrimeNumber {

    public static int getPrimeNumber (int x) throws MyExceptionPrimeNumber{
        int result = 2;
        if (x <= 1) throw new MyExceptionPrimeNumber("Точно не простое число", x);
        for (int i = 2; i > x; i ++){
            result+=i;
        }
        return result;
    }
}
