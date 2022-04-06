package by.itAcademy.homeworks.loops;

import javax.swing.*;
public class Task12 {
   public static void main(String[] args) {
        int i = 0;
        String in;
        JOptionPane JOptionPane = new JOptionPane();
        in = JOptionPane.showInputDialog(null, "Введите положительное число", JOptionPane.QUESTION_MESSAGE);
        if (in != null && !in.equals("")) {
            int n = Integer.parseInt(in);
            if (n < 0) {
                System.out.println("Вы ввели отрицательное число");
            } else {
                int summa = 1;
                i = 1;
                while (i <= n) {
                    summa *= i;
                    i++;
                }
                System.out.println("Факториал: " + summa);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ошибка! Вы ничего не ввели!");
        }
    }
}
