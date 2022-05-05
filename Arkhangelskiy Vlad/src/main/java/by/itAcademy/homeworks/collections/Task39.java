package by.itAcademy.homeworks.collections;

/**
 * Task 39
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.
 */



import java.util.ArrayList;
import java.util.Random;

public class Task39 {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++ ){
            marks.add(random.nextInt(11));
        }

        System.out.println(filteredMarks(marks, 8));

    }

    public static ArrayList<Integer> filteredMarks(ArrayList<Integer> marks, int boundValue){

        ArrayList<Integer> positiveMarks = new ArrayList<>();

        for (Integer mark : marks) {
            if (mark >= boundValue) {
                positiveMarks.add(mark);
            }
        }
        return positiveMarks;
    }
}
