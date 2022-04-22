/*Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
Найти самую высокую оценку с использованием итератора.*/

package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество оценок: ");
        int countOfMarks = sc.nextInt();
        ArrayList<Integer> nums = fillList(countOfMarks);
        System.out.println("Все оценки: " + nums);
        System.out.println("Самая высокая оценка: " + maxMark(nums));
    }

    public static ArrayList<Integer> fillList(int num){
        ArrayList<Integer> marks = new ArrayList<Integer>(num);
        for(int i = 0 ; i< num ; i++){
            marks.add((int)(Math.random() * 10 + 1));
        }
        return marks;
    }

    public static int maxMark(ArrayList<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        int max = list.get(0);
        while(iterator.hasNext()){
            Integer nextMark = iterator.next();
            if(max <=nextMark){
                max = nextMark;
            }
        }
        return max;
    }
}
