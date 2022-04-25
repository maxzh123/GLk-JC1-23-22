/*Написать собственное исключение от Exception.
Сгенерировать код, который будет выбрасывать его и обрабатывать.
Результат работы программы вывести на экран.*/

package by.itAcademy.homeworks.exceptions;

public class Task44 {
    public static void main(String[] args) {
        try{
            int a = (int)(Math.random()* 2) -1;
            System.out.println("a = " + a);
            try {
                int b = 1/a;
                StringBuilder sb = new StringBuilder(a);
            }catch (NegativeArraySizeException e){
                System.err.println("недопустимый размер буфера: " + e);
            }
        }catch (ArithmeticException e){
            System.err.println("деление на 0 : " + e);
        }
    }
}
