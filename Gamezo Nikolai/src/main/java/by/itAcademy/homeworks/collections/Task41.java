package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Задание 41
 * Создать список оценок учеников с помощью ArrayList,
 * заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.
 */

public class Task41 {
    public static void main(String[] args) {
        int numOfStudets = 20;
        ArrayList<Integer> assessment = new ArrayList<Integer>();
        fillArray(assessment, numOfStudets);
        System.out.println("Исходные оценки: " + assessment);
        System.out.println("Максимальная оценка: " + findMaxAssessment(assessment));
    }
    //заполнение ArrayList
    public static ArrayList<Integer> fillArray(ArrayList<Integer> assessment, int numOfStudets) {
        for (int i = 0; i <= numOfStudets; i++) {
            assessment.add((int) (Math.random() * 11));
        }
        return assessment;
    }
    //поиск максимального элемента
    public static int findMaxAssessment(ArrayList<Integer> assessment) {
        int maxAssessment = assessment.get(0);
        Iterator<Integer> iterator = assessment.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i > maxAssessment) {
                maxAssessment = i;
            }
        }
        return maxAssessment;
    }
}
