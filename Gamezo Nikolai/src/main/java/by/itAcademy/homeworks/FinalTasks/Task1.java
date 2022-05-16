package by.itAcademy.homeworks.FinalTasks;

public class Task1 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 100);
        int y = (int) (Math.random() * 100);
        int z = (int) (Math.random() * 100);
        if (x > z) {
            System.out.println("Сумма x + y = " + (x + y));
        } else {
            System.out.println("z = " + z);
        }
        System.out.println("Среднее арифметическое = "+  (x + y + z) / 3);
    }
}