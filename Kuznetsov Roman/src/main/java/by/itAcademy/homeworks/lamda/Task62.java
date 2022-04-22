package by.itAcademy.homeworks.lamda;

import by.itAcademy.homeworks.io.Task51.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

//> Создайте класс Person с полями name, surname, age. Сгенерируйте группу из
//        > 100 человек в возрасте от 15 до 30. Напишите ОДНУ НЕПРЕРЫВНУЮ цепочку
//        > stream вызовов, которая:
//        > 1. выбирает объекты, возраст которых меньше 21;
//        > 1. распечатывает их на экран;
//        > 1. сортирует по фамилии, а потом по имени (использовать thenComparing у объекта Comparator);
//        > 1. берет 4 первых объекта;
//        > 1. формирует коллекцию из фамилий объектов;
//        > 1. агрегирует все в коллекцию.

public class Task62 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            people.add(new Person(new Random().nextInt(100),"John"+i,"Doe"+i));
        }
        List<String> finalPeople = people.stream()
                .filter((x) -> x.getAge() < 21)
                .peek(System.out::println)
                .sorted((Comparator.comparing(Person::getSurname).thenComparing(Person::getName)))
                .limit(4)
                .map(Person::getSurname)
                .collect(Collectors.toList());
        System.out.println("Result:"+finalPeople);
    }
}
