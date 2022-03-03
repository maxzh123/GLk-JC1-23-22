package by.itAcademy.homeworks.arrays;

/**Создайте переменную для массива из 10 элементов.
 Заполните его произвольными значениями целочисленного типа.
 Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
 Если значений максимальных и минимальных несколько,
 то необходимо взять максимальное значение разницы индексов между максимальным и минимальным значениями.
  */
public class Task21 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.println(sum_between_max_min(fill(arr)));
    }

    public static int[] fill(int array[]){
        for (int i=0; i<array.length;i++){
            array[i] = (int)(Math.random()*10+1);
        }
        return array;
    }

    public static int sum_between_max_min(int array[]){
        int sum = 0;
        if (max_count(array)+min_count(array) ==2){
            if (find_min_ind(array) < find_max_ind(array)){
                for (int i=find_min_ind(array)+1; i<find_max_ind(array);i++) {
                    sum += array[i];
                }
            } else{
                for (int i=find_max_ind(array)+1; i<find_min_ind(array);i++) {
                    sum += array[i];
                }
            }
        } else{
            for (int i = 0; i<array.length;i++){
                if (array[i] == array[find_min_ind(array)]){
                    for (int j=i; j< array.length;j++){
                        if (array[j] ==array[find_max_ind(array)] && j-i>sum){
                            sum = j-i;
                        }
                    }
                }
                if (array[i] == array[find_max_ind(array)]){
                    for (int j=i+1; j< array.length;j++){
                        if (array[j] ==array[find_min_ind(array)] && j-i>sum){
                            sum = j-i;
                        }
                    }
                }
            }
        }
        return sum;
    }

    public static int find_min_ind(int array[]) {
        int min = array[0];
        int min_ind = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                min_ind = i;
            }
        }
        return min_ind;
    }

    public static int find_max_ind(int array[]) {
        int max = array[0];
        int max_ind = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                max_ind = i;
            }
        }
        return max_ind;
    }

    public static int min_count(int array[]) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[find_min_ind(array)]) {
                count++;
            }
        }
        return count;
    }

    public static int max_count(int array[]) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[find_max_ind(array)]) {
                count++;
            }
        }
        return count;
    }

}
