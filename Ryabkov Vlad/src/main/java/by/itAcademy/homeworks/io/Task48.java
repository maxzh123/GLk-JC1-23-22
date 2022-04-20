package by.itAcademy.homeworks.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Создать файл с текстом, в котором присутствуют числа. Найти все числа,
 * вывести на экран, посчитать сумму, убрать все повторяющиеся числа и снова
 * вывести на экран.
 */
public class Task48 {
    public static void main(String[] args) throws FileNotFoundException {
        String str = " ";
        try {
            BufferedReader br = new BufferedReader(new FileReader
                    ("D:\\Task48.txt"));
            String strBr;
            while ((strBr = br.readLine()) != null) {
                str += strBr;
                System.out.println(getSum(str));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Invalid input");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getSum(String str) {
        if (!str.matches("^\\D*$")) {
            System.out.println("STR1 содержит цифры!");
        } else {
            System.out.println("STR1 не содержит цифр!");
        }


        int count = 0, sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
                sum += count;
            }
        }
        if ((count >= 1) && (sum >= 1)) {
            System.out.println("STR содержит " + count + " цифр и их сумма = " + sum);
        } else {
            System.out.println("STR не содержит цифр, невозможно вычислить сумму!");
        }
        return count;
    }
}

