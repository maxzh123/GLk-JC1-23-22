package by.itAcademy.homeworks.helper;

public class Array {
    public static void elementArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }
}
