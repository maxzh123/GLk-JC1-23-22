package by.itAcademy.homeworks.arrays;


/**Вернет минимальный индекс минимального значения*/

public class SearchMin {
    private static int minF;
    private static int maxF;


    public static int lastMin(int [] arr){
        int min=arr[arr.length-1];
        int lastIndexMin=arr.length-1;
        for (int i=arr.length-2;i>=0;i--){
            if (arr[i]<min){
                min=arr[i];
                lastIndexMin=i;
            }
        }
        return minF=lastIndexMin;
    }
    public static int firstMin (int [] arr){
        int min=arr[0];
        int firstIndexMin=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                firstIndexMin=i;
            }
        }
        return maxF=firstIndexMin;
    }

    public static int minMaxIndexForMax (int lastIndex, int firstIndex){
        if (lastIndex>firstIndex){
            return lastIndex;
        }else return firstIndex;
    }
}
