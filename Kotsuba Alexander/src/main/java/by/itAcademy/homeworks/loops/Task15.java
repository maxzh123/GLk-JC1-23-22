/*Найти среди чисел от 50 до 70 второе простое число
 (число называют простым, если оно делится без остатка только на 1 и себя) и завершить цикл с использованием break.*/
package by.itAcademy.homeworks.loops;

public class Task15 {
    public static void main(String[] args) {
        boolean s = true;
        for (int i = 50; i <= 70;i++) {
            for (int j = 2; j < i; j++) {
                if (i % j== 0) {
                    s = false;
                    break;
                }
            }
            if (s){
                System.out.println(i);
            }else{
                s = true;
            }
        }

    }
}
