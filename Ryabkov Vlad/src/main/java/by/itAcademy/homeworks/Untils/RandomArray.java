package by.itAcademy.homeworks.Untils;

public class RandomArray {
    public static int[] randomarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100) + 1);
        }
        return array;
    }
}
