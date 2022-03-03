package by.itAcademy.homeworks.loops;


/**
 * Вычисление факториала до 10го числа
 */

public class Task12 {
    public static void main(String[] args) {
        int i = 1;
        int result=1;
        while(i<11){ //Проверка условия на истинность и начало тела цикла
            result*=i;
            i++;
        }
        System.out.println(result);
    }

}
