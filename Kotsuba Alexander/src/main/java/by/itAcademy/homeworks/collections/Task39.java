/*Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
Удалить неудовлетворительные оценки из списка.*/

package by.itAcademy.homeworks.collections;

import java.util.ArrayList;

public class Task39 {
    public static void main(String[] args) {
        int el = 10;
        int neg = 5;
        ArrayList<Integer> marks = new ArrayList<Integer>();
        for(int i = 0;i<el;i++){
            marks.add(i,(int)(Math.random() * 10 + 1));
        }
        System.out.println(marks);
        marks.removeIf(score->score <=neg);
        System.out.println(marks);
    }
}
