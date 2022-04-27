package by.itAcademy.homeworks.arrays;
/**> Создать двухмерный квадратный массив и заполнить его «бабочкой», то есть
        > таким образом:

        1 1 1 1 1
        0 1 1 1 0
        0 0 1 0 0
        0 1 1 1 0
        1 1 1 1 1*/
public class Task23 {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                if (x <= y && x <= arr[x].length - 1 - y || x >= y && x >= arr[x].length - 1 - y) {
                    arr[x][y] = 1;
                }
                System.out.print(arr[x][y] + "     ");
            }
            System.out.print("\n");
        }
    }
}
