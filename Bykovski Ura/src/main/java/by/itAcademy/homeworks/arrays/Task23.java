package by.itAcademy.homeworks.arrays;

import java.util.Scanner;

//Создать двухмерный квадратный массив и заполнить его «бабочкой»
public class Task23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n=sc.nextInt();
        int array[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if ((i<=j && i<=n-1-j) || (i>=j && i>=n-1-j)){
                    array[i][j]=1;
                } else {
                    array[i][j]=0;
                }
            }
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
