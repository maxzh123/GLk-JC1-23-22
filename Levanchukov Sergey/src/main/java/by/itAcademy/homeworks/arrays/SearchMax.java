package by.itAcademy.homeworks.arrays;

public class SearchMax {
    public static int lastMax(int [] arr){
        int max=arr[arr.length-1];
        int lastIndexMax=arr.length-1;
        for (int i=arr.length-2;i>=0;i--){
            if (arr[i]>max){
                max=arr[i];
                lastIndexMax=i;
            }
        }
        return lastIndexMax;
    }
    public static int firstMin (int [] arr){
        int max=arr[0];
        int firstIndexMax=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                firstIndexMax=i;
            }
        }
        return firstIndexMax;
    }
    //исправить
    public static int minMaxIndexForMax (int lastIndex, int firstIndex){
        if (lastIndex>firstIndex){
            return lastIndex;
        }else return firstIndex;
    }
}
