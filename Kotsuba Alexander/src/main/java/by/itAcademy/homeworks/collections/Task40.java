/*Создать коллекцию, заполнить ее случайными целыми числами. Удалить повторяющиеся числа.*/

package by.itAcademy.homeworks.collections;

import java.util.*;

public class Task40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int x = sc.nextInt();


        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0 ; i<x;i++){
            numbers.add((int)(Math.random() * 10 + 1));
        }
        System.out.println("Массив с повторками: " + numbers);

        Set<Integer> set = new LinkedHashSet<>(numbers);
        numbers.clear();
        numbers.addAll(set);
        System.out.println("Массив без повторок: " +set);

    }
}
