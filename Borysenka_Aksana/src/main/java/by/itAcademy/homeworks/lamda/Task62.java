package by.itAcademy.homeworks.lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task62 {

    /**Task62
     * Создайте класс Person с полями name, surname, age. Сгенерируйте группу из 100 человек в возрасте от 15 до 30.
     * Напишите ОДНУ НЕПРЕРЫВНУЮ цепочку stream вызовов, которая:
     *
     * выбирает объекты, возраст которых меньше 21;
     * распечатывает их на экран;
     * сортирует по фамилии, а потом по имени (использовать thenComparing у объекта Comparator);
     * берет 4 первых объекта;
     * формирует коллекцию из фамилий объектов;
     * агрегирует все в коллекцию.
     */

    public static void main(String[] args) {
        int numberPeopleOfGroup = 100;
        List<PersonForTask62> lst = new ArrayList<>();
        for (int i = 1; i <= numberPeopleOfGroup; i++){
            lst.add(new PersonForTask62("Ivan" + (int)(Math.random()*100+1), "Ivanov" + (int)(Math.random()*100+1), (int)(Math.random()*16 + 15)));
        }

        System.out.println(lst.stream()
                .filter( age -> age.getAge() < 21)
                .peek(System.out::println)
                .sorted(Comparator.comparing(PersonForTask62 :: getSurName).thenComparing(PersonForTask62 :: getName))
                .limit(4)
                .map(PersonForTask62 :: getSurName)
                .collect(Collectors.toList())
        );
    }
}


