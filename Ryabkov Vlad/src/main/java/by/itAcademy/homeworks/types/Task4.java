package by.itAcademy.homeworks.types;

/**## Задание 4
        > Написать метод, который принимает на вход два целых числа, делает их
        > суммирование и складывает результат с произведением двух этих чисел, и
        > возвращает полученный результат из метода. Передать на вход в метод любые два
        > числа. Вывести полученный результат работы метода на экран
 **/



public class Task4 {
    static  int resultvalues(int value1, int value2){
        int result = (value1 + value2) + (value1 * value2);
        return result;
    }

    public static void main(String[] args) {
        int result1 = resultvalues(5,10);
        System.out.println(result1);
    }
}