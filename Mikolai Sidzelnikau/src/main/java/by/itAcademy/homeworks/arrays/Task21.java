package by.itAcademy.homeworks.arrays;

import java.util.Arrays;
/**## Задание 21
        > Создайте переменную для массива из 10 элементов. Заполните его
        > произвольными значениями целочисленного типа. Определите сумму элементов
        > массива, расположенных между минимальным и максимальным значениями. Если
        > значений максимальных и минимальных несколько, то необходимо взять
        > максимальное значение разницы индексов между максимальным и минимальным
        > значениями.*/
public class Task21 {
    private int[] array;
    private int indexOfMin = 0;
    private int indexOfMax = 0;
    private int indexOfMin2 = 0;
    private int indexOfMax2 = 0;
    private int obSum = 0;
    private int obSumIndex = 0;

    private int setObSum(int indexOfMin,int indexOfMax) {
        while (indexOfMin > indexOfMax){
            obSum += array[indexOfMin - 1];
            indexOfMin--;
            if (indexOfMin == indexOfMax + 1){
                break;
            }
        }
        while (indexOfMin < indexOfMax){
            obSum += array[indexOfMin + 1];
            indexOfMin++;
            if (indexOfMin == indexOfMax - 1){
                break;
            }
        }
        return obSum;
    }

    private int getComparisonSumIndex() {
        setComparisonSumIndex(indexOfMin,indexOfMax,indexOfMin2,indexOfMax2);
        return obSumIndex;
    }

    private void setComparisonSumIndex(int indexOfMin, int indexOfMax, int indexOfMin2, int indexOfMax2) {
        int[] ints = new int[10];
        int s = 0;
        int r = 0;
        int rs = 0;
        for (int i = 0; i < ints.length; i++) {
            ints[i] = 1;
        }
        for (int i = 0; i < ints.length; i++) {
            if (i == indexOfMin){
                ints[i] = 0;
            }
            if (i <=  indexOfMin || i == indexOfMax){
                ints[i] = 2;
                if(ints[i]==2){
                    rs += ints[i];
                }
            }
        }
        for (int i = 0; i < ints.length; i++) {
            if (i>=indexOfMin2 && i<=indexOfMax2){
                ints[i] = 2;
                if (ints[i]==2){
                    s += ints[i];
                }
            }
        }
        if (rs<s){
            setObSum(indexOfMin,indexOfMax2);
        }else if (rs==s){
            setObSum(indexOfMin,indexOfMax);
        }if(rs>s){
           setObSum(indexOfMin2,indexOfMax);
        }
    }
    public Task21(int[] array) {
        this.array = array;
    }

    public int getArray() {
        setArraySearchIndexMinMax(indexOfMin,indexOfMax,indexOfMin2,indexOfMax2);
        getComparisonSumIndex();
        return obSum;
    }

    private void setArraySearchIndexMinMax(int indexOfMin, int indexOfMax, int indexOfMin2, int indexOfMax2) {
        int sumIndex = array[0];
        int sumIndex2 = array[0];
        for (int i = 0; i < array.length; i++) {
           if (array[i]<sumIndex){
               sumIndex = array[i];
               indexOfMin = i;
           }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]==sumIndex){
                indexOfMin2 = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]>sumIndex2){
                sumIndex2 = array[i];
                indexOfMax = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]==sumIndex2){
                indexOfMax2 = i;
            }
        }
        this.indexOfMax2 = indexOfMax2;
        this.indexOfMin2 = indexOfMin2;
        this.indexOfMin = indexOfMin;
        this.indexOfMax = indexOfMax;
    }

    @Override
    public String toString() {
        return "Task21{" +
                "array=" + Arrays.toString(array) +
                ", indexOfMin=" + indexOfMin +
                ", indexOfMax=" + indexOfMax +
                ", indexOfMin2=" + indexOfMin2 +
                ", indexOfMax2=" + indexOfMax2 +
                ", obSum=" + obSum +
                '}';
    }
}
