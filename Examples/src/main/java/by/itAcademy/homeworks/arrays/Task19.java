package by.itAcademy.homeworks.arrays;
import java.util.Arrays;

public class Task19 {
    public static void main(String[] args) {
        main1("привет","как дела","что делаешь");
    }
    public static void main1(String... args) {
        System.out.println(Arrays.toString(args));

        int[][] matrix=new int[10][15];
        matrix[5][8]=15;
        matrix=null;
        for (int[] line:matrix) {
            System.out.println(Arrays.toString(line));
        }
    }
}
