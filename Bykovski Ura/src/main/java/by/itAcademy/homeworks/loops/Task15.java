package by.itAcademy.homeworks.loops;
//Найти среди чисел от 50 до 70 второе простое число (число называют простым, если оно делится без остатка только на 1 и себя) и завершить цикл с использованием break.
public class Task15 {
    public static void main(String[] args){
        boolean flag;
        int i;
        int t;
        int k=0;
        int p=0;
        for (i=50; i<70;i++){
            t=0;
            for (int j=2; j<i;j++){
                if (i % j==0){
                    t++;
                }
            }
            if (t==0){
                k++;
            }
            if (k==2){
                p=i;
                break;
            }
        }
        System.out.println("Второе простое число "+p);
    }
}
