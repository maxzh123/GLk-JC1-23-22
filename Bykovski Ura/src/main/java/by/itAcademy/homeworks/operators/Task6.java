package by.itAcademy.homeworks.operators;
//Создайте метод с одним целочисленным параметром. Метод должен определить, является ли последняя цифра числа семеркой и вернуть boolean значение.
public class Task6 {
    public static boolean lastdigit(int a){
       boolean b=a%10==7;
       if (b)
           return b;
       else
           return b;
    }
    public static void main(String[] args){
        System.out.println(lastdigit(48));
    }
}
