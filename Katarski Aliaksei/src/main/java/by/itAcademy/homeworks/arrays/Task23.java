package by.itAcademy.homeworks.arrays;

public class Task23 {
    public static void main(String [] args){
        int[][] array=new int [5][5];
        butterfly(array);
    }
    public static int[][] butterfly(int[][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if((i<=j && i<=array[i].length-1-j) || (i>=j && i>=array[i].length-1-j)){
                 array[i][j]=1;
                }else {
                    array[i][j] =0;
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }return array;
    }
        }

