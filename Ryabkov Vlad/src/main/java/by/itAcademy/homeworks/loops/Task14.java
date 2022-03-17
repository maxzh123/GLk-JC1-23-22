package by.itAcademy.homeworks.loops;

/**
 * Посчитать сумму цифр числа 7893823445 с помощью цикла do while
 */

public class Task14 {
    public static void main(String[] args) {
        long value = 7_893_823_445L;
        System.out.println(calculate(value));
    }

    //создаю функцию, которая буде разбивать число на составляющие и  высчитывать их сумму
    public static long calculate (long value){
        int result = 0;
        do {
            result +=value % 10;
            value/=10;
        }while (value !=0);
        return result;
    }
}

