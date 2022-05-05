package by.itAcademy.homeworks.loops;
/**Найти среди чисел от 50 до 70 второе простое число (число называют простым,
        > если оно делится без остатка только на 1 и себя) и завершить цикл с
        > использованием break.*/
public class Task15 {
    public static void main(String[] args) {
        for (int i = 50; i <= 70; i++) {
            boolean isTrue=true;
            for (int x = 2; x < i; x++) {
                if (i % x == 0) {
                    isTrue = false;
                    break;
                }
            }if (isTrue){
                System.out.println(i);

            }
        }
    }
}