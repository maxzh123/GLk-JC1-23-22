package by.itAcademy.homeworks.arrays;

import java.util.Scanner;

/*Создайте переменную для массива из 10 элементов.
 Заполните его произвольными значениями целочисленного типа.
 Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
 Если значений максимальных и минимальных несколько, то необходимо взять максимальное значение разницы индексов между максимальным и минимальным значениями.
 */
public class Task21 {
    public static void main(String[] args) {
        int sum=0;
        int i;
        int array[]=new int[10];//{3,2,2,1,1,2,1,1,3,1,3,3}
        for (i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100);
            System.out.println(array[i]);
        }
        int min=array[0];
        int max=array[0];
        for (i=0;i<array.length;i++){
            if (min>array[i]) {
                min = array[i];
            }
            if (max<array[i]) {
                max = array[i];
            }
        }
        int kmin=0;
        int kmax=0;
        for (i=0;i<array.length;i++){
            if (min==array[i]){
                kmin+=1;
            }
            if (max==array[i]){
                kmax+=1;
            }
        }
        if (kmin==1 && kmax==1){
            int min_index=0;
            int max_index=0;
            for (i=0;i<array.length;i++){
                if (min==array[i]){
                    min_index=i;
                }
                if (max==array[i]){
                    max_index=i;
                }
            }
            if (min_index<max_index){
                for (i=min_index+1;i<max_index;i++){
                    sum+=array[i];
                }
            } else {
                for (i=max_index+1;i<min_index;i++){
                    sum+=array[i];
                }
            }
        }
        if (kmin>1){
            if (kmax==1){
                int first_min_index=0;
                int last_min_index=0;
                int max_index=0;
                for (i=0;i<array.length;i++){
                    if (min==array[i]){
                        first_min_index=i;
                        break;
                    }
                }
                for (i=0;i<array.length;i++) {
                    if (min == array[i]) {
                        last_min_index = i;
                    }
                }
                for (i=0;i<array.length;i++) {
                    if (max == array[i]) {
                        max_index = i;
                    }
                }
                if (max_index-first_min_index>last_min_index-max_index){
                    for (i=first_min_index+1;i<max_index;i++){
                        sum+=array[i];
                    }
                }else {
                    for (i=max_index+1;i<last_min_index;i++){
                        sum+=array[i];
                    }
                }
            }else {
                int first_min_index=0;
                int last_min_index=0;
                int first_max_index=0;
                int last_max_index=0;
                for (i=0;i<array.length;i++){
                    if (min==array[i]){
                        first_min_index=i;
                        break;
                    }
                }
                for (i=0;i<array.length;i++){
                    if (min==array[i]){
                        last_min_index=i;
                    }
                }
                for (i=0;i<array.length;i++){
                    if (max==array[i]){
                        first_max_index=i;
                        break;
                    }
                }
                for (i=0;i<array.length;i++){
                    if (max==array[i]){
                        last_max_index=i;
                    }
                }
                if (first_min_index<first_max_index){
                    if (last_max_index-first_min_index>last_min_index-first_max_index){
                        for (i=first_min_index+1;i<last_max_index;i++){
                            sum+=array[i];
                        }
                    }else{
                        for (i=first_max_index+1;i<last_min_index;i++){
                            sum+=array[i];
                        }
                    }
                }else{
                    if (last_min_index-first_max_index>last_max_index-first_min_index){
                        for (i=first_max_index+1;i<last_min_index;i++){
                            sum+=array[i];
                        }
                    } else{
                        for (i=first_min_index+1;i<last_max_index;i++){
                            sum+=array[i];
                        }
                    }
                }
            }
        }
        if (kmin==1 && kmax>1){
            int min_index=0;
            int first_max_index=0;
            int last_max_index=0;
            for (i=0;i<10;i++){
                if (max==array[i]){
                    first_max_index=i;
                    break;
                }
            }
            for (i=0;i<array.length;i++) {
                if (max == array[i]) {
                    last_max_index = i;
                }
            }
            for (i=0;i<array.length;i++) {
                if (min == array[i]) {
                    min_index = i;
                }
            }
            if (min_index-first_max_index>last_max_index-min_index){
                for (i=first_max_index+1;i<min_index;i++){
                    sum+=array[i];
                }
            }else {
                for (i=min_index+1;i<last_max_index;i++){
                    sum+=array[i];
                }
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
