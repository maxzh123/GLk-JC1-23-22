package by.itAcademy.homeworks.collections;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Task39 {

    /**
     * Task39
     * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.
     */


    public static void main(String[] args) {
        int numberOfStudents = 20;
        int negativeMarks = 3;

        // первый варинат

//        ArrayList<Integer> marks = new ArrayList<>(numberOfStudents);
//        for (int i = 0; i <= numberOfStudents; i++) {
//            marks.add(i, (int) (Math.random() * 10 + 1));
//        }
//        System.out.println(marks);
//        marks.removeIf(n -> (n <= 3));
//        System.out.println(marks);
//
//
//        // второй вариант

////        ArrayList<Integer> newMarksWithoutNegatives = new ArrayList<>();
////
////        for (int i = 0; i <= numberOfStudents; i++){
////            int k = marks.get(i);
////            if (k <= negativeMarks){
////                newMarksWithoutNegatives.add(k);
////            }
////        }
//
////        marks.removeAll(newMarksWithoutNegatives);
////        System.out.println(marks);
//    }
//
//}


        // третий вариант (вроде работает, но что-то смущает...так принимается?)
        List<Integer>m=marks(numberOfStudents);
        System.out.println(m);
//        System.out.println(newMarksWithoutNegatives(m, negativeMarks));

        m.stream().filter(mark->mark>negativeMarks)
                .forEach(System.out::println);


    }


    public static List marks(int number) {
        ArrayList<Integer> marks = new ArrayList<>(number);
        for (int i = 0; i <= number; i++) {
            marks.add(i, (int) (Math.random() * 10 + 1));
        }
        return marks;
    }

    public static List newMarksWithoutNegatives(List<Integer> t, int negativeNumb) {
        ArrayList<Integer> newMarks = new ArrayList<>();

        for (int i = 0; i <= t.size()-1; i++) {
            int k = t.get(i);
            if (k > negativeNumb) {
                newMarks.add(k);
            }
        }
        return newMarks;
    }

}
