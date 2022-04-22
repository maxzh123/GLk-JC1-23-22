package by.itAcademy.homeworks.objects;

public class Task24 {
    public static void main(String[] args) {
        Time time = new Time(11, 0, 0);
        Time time1 = new Time(10);
        int result = time.compareTo(time1);
        if (result == 0) {
            System.out.println("Time равно Time1");
        }
        else if (result == 1) {
            System.out.println("Time больше Time1");
        }
        if (result == -1) {
            System.out.println("Time мешьше Time1");
        }
    }
}
