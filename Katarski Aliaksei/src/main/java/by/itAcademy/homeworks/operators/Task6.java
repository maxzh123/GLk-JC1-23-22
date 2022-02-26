package by.itAcademy.homeworks.operators;
/** Создайте метод с одним целочисленным параметром. Метод должен
 > определить, является ли последняя цифра числа семеркой и вернуть boolean
 > значение
 */

public class Task6{
    public static void main(String[] args){
        int num=1231245127;
    if(num%10==7){
        System.out.println(true);
    }else{
        System.out.println(false);
    }
    }
}
