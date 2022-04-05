package by.itAcademy.homeworks.arrays;

/**
 *  Создать двухмерный квадратный массив и заполнить его «бабочкой»
 */
import static java.lang.System.out;

// решение не мое, найдено в интернете. пытаюсь разобраться в многомерных массивах
public class Task23 {
    public static void main(String[] args) {
        int arr[][]=new int[6][6];
        int i,j;

        for (i = 0; i < arr.length/2+1; i++){
            for (j = 0; j < arr[i].length; j++){
                if ((j < i) || ( j >= (arr[i].length-i)))
                    arr [i][j] = 0;
                else
                    arr [i][j] = 1;
            }
        }
        for (i=arr.length-1; i>=arr.length/2; i--){
            for (j=0; j<arr[i].length; j++){
                if ((j<(arr[i].length-1-i)) || (j>i))
                    arr[i][j]=0;
                else
                    arr[i][j]=1;}
        }
        for (i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                out.print(arr[i][j]);
            }
            out.println(" ");
        }
    }


}





