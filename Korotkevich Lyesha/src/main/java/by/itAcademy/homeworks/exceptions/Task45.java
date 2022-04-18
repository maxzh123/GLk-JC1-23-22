package by.itAcademy.homeworks.exceptions;

/**Написать метод, который будет возбуждать исключение и обработать это исключение на уровне выше.
 * Результат работы программы вывести на экран.*/

public class Task45 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        try {
            System.out.println(arraySum(array));
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    public  static int arraySum(int[] arr) throws ArrayIndexOutOfBoundsException{
        int sum = 0;
        for (int i = 0; i < arr.length+1; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
