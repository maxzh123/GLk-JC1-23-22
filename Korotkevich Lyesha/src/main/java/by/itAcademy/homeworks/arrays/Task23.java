package by.itAcademy.homeworks.arrays;

/**Создать двухмерный квадратный массив и заполнить его «бабочкой»*/
public class Task23 {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        print_butterfly(butterfly(arr));
    }
    public static int[][] butterfly(int[][] array){
        for (int i =0; i < array.length;i++){
            for (int j = 0; j< array[i].length; j++){
                if((i<=j && i<=array[i].length-1-j) || (i>=j && i>=array[i].length-1-j)){
                    array[i][j] = 1;
                } else{
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
    public static void print_butterfly(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
