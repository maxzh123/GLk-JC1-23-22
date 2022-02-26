package by.itAcademy.homeworks.types;

public class Task4 {
    //создаем метод для вычисления
    static int method(int a, int b) {
        int с = (a+b)+ (a*b);
        return с;
    }
    // передаем в метода 2 числа и выводим на экран результат
    public static void main (String[] arg) {
    int rez = method(5,2);
    System.out.println(rez);
    }
}



