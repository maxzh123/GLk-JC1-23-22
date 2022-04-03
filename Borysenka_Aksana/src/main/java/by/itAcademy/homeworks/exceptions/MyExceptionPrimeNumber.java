package by.itAcademy.homeworks.exceptions;

public class MyExceptionPrimeNumber extends Exception{


    private int number;

    public int getNumber() {
        return number;
    }

    public MyExceptionPrimeNumber(String message, int number) {
        super(message);
        this.number = number;
    }

}

