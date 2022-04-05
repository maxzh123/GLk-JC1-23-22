package by.itAcademy.homeworks.loops;

import java.util.Scanner;

/**Посчитать сумму цифр числа 7893823445 с помощью цикла do while.*/
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char num [] = scanner.nextLine().toCharArray();
        int i=0; int resuit=0;
        do {
            resuit+= Integer.parseInt(String.valueOf(num[i]));
            i++;
        }while (i< num.length);
        System.out.println("Summa numbers" +resuit);
    }
}
