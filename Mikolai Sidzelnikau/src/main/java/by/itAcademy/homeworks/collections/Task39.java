package by.itAcademy.homeworks.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**## Задание 39
        > Создать список оценок учеников с помощью ArrayList, заполнить случайными
        > оценками. Удалить неудовлетворительные оценки из списка.*/

public class Task39 {
    List<String> list;

    public List<String> getList() {
        list = new ArrayList<>();
        list.listIterator(0).add("Наташа");
        list.listIterator(1).add("Маша");
        list.listIterator(2).add("Леша");
        list.listIterator(3).add("Алексей");
        list.listIterator(4).add("Маша");
        list.listIterator(5).add("Саша");
        list.add("Гриша");
        list.add("Богдан");
        list.add("Марк");
        list.add("Стела");
        list.add("Коля");
        list.add("Рома");
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            int s = 0;
            s = random.ints(s,10).findFirst().getAsInt();
            if (s>4){
                System.out.println(list.get(i)+"=" +s);
            }else if (s<6 && i == 10){    // Я не специально так чисто проверить индекс :)
                System.out.println(list.get(i)+"="+10);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Task39 task39 = new Task39();
        task39.getList();
    }
}