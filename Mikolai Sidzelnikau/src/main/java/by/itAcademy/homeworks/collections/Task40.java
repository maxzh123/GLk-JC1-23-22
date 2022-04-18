package by.itAcademy.homeworks.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**## Задание 40
        > Создать коллекцию, заполнить ее случайными целыми числами. Удалить
        > повторяющиеся числа.*/
public class Task40 {
    public List<Integer> getList() {
        list = new ArrayList<>();
        Random random = new Random();
        int s = 0;
        for (int i = 0; i < 10; i++) {
            s = random.ints(0,50).findFirst().getAsInt();
            list.add(i,s);
        }
        int sumList = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)){
                    list.remove(i);
                }
            }
        }
        System.out.println(list);
        return list;
    }
    List<Integer> list;
    public static void main(String[] args) {
        Task40 task40 = new Task40();
        task40.getList();
    }
}
