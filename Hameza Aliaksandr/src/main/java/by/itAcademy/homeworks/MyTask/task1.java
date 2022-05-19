package by.itAcademy.homeworks.MyTask;

public class task1 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 100);
        int y = (int) (Math.random() * 100);
        int z = (int) (Math.random() * 100);
        if (x > z) {
            System.out.println("x + y = " + x + y);
        } else {
            System.out.println("z = " + z);
        }
        System.out.println("Cреднее арифметическое x,y,z =" + (x + y + z) / 3 );
    }
}
