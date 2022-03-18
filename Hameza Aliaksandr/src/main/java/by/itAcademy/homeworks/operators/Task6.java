package by.itAcademy.homeworks.operators;
/**
 Создайте метод с одним целочисленным параметром. Метод должен определить, является ли последняя цифра числа семеркой и вернуть boolean значение
 */
public class Task6 {
    public static void main(String[] args) { System.out.println(LastSeven(57));}
        public static boolean LastSeven(int a) {
            boolean b = a % 10 == 7;
            return b;

    }
}

