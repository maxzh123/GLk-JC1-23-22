package by.itAcademy.homeworks.collections;

import java.util.ArrayList;

/**
 * Задание 39
 * Создать список оценок учеников с помощью ArrayList,
 * заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.
 */
public class Task39 {
    public static void main(String[] args) {
        int numOfStudets = 25;
        ArrayList<Integer> assessment = new ArrayList<Integer>();
        fillArray(assessment, numOfStudets);
        System.out.println("Исходные оценки: " + assessment);
        System.out.println("Удовлетворительные оценки: " + deleteUnsatisfactory(assessment));
    }
    //заполнение ArrayList
    public static ArrayList<Integer> fillArray(ArrayList<Integer> assessment, int numOfStudets) {
        for (int i = 0; i <= numOfStudets; i++) {
            assessment.add((int) (Math.random() * 11));
        }
        return assessment;
    }
    //перенос всех положительных оценок в новый ArrayList
    public static ArrayList<Integer> deleteUnsatisfactory(ArrayList<Integer> assessment) {
        ArrayList<Integer> assessmentNew = new ArrayList<Integer>();
        for (int i = 0; i <= assessment.size() - 1; i++) {
            if (assessment.get(i) > 3) {
                assessmentNew.add(assessment.get(i));
            }
        }
        return assessmentNew;
    }
}
