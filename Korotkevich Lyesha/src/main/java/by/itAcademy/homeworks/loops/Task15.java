package by.itAcademy.homeworks.loops;

/** Найти среди чисел от 50 до 70 второе простое число
    (число называют простым, если оно делится без остатка только на 1 и себя)
    и завершить цикл с использованием break.
 */

public class Task15 {
    public static void main(String[] args){
        System.out.println(SecondSimple());
    }

    public static int SecondSimple(){
        int c = 0;
        int n = 0;
        for (int i =50 ; i <= 70; i++){
            if (c == 1 && Simple(i) == true){
                n = i;
                break;
            } else if (Simple(i) == true){
                c++;
            }
        }
        return n;
    }
    public static boolean Simple(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}
