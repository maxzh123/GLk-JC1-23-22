package by.itAcademy.homeworks.loops;

public class Task15 {
    /**
     *Найти среди чисел от 50 до 70 второе простое число (число называют простым, если оно делится без остатка только на 1 и себя)
     * и завершить цикл с использованием break.
     */

    public static void main (String[] arg) {
        int secSimple = 0;
        int index = 0;
        for (int i = 50; i <= 70; i++){
            if (isPrime(i)){
                index++;
            } if (index == 2){
                secSimple = i;
                break;
            }
        }
        System.out.println("Second prime is " + secSimple);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}




//    private static int secSimple=0;
//    public static void main (String[] arg){
//        boolean b = true;
//        for (int i = 50; i <= 70; i++){
//            for (int j = 2; j < i; j++){
//                if (i%j ==0){
//                    b = false;
//                    break;
//                }
//            }
//            if (b) {
//                System.out.println(i);
//            }
//            else b = true;
//        }
//    }
//}