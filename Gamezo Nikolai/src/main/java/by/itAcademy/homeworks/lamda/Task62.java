package by.itAcademy.homeworks.lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Задание 62
 * Создайте класс Person с полями name, surname, age. Сгенерируйте группу из 100 человек в возрасте от 15 до 30. Напишите ОДНУ НЕПРЕРЫВНУЮ цепочку stream вызовов, которая:
 * выбирает объекты, возраст которых меньше 21;
 * распечатывает их на экран;
 * сортирует по фамилии, а потом по имени (использовать thenComparing у объекта Comparator);
 * берет 4 первых объекта;
 * формирует коллекцию из фамилий объектов;
 * агрегирует все в коллекцию.
 */

public class Task62 {
    public static  void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            persons.add(new Person("Name" + i, "Surname" + i, (int)(Math.random()*16 + 15)));
        }
        System.out.println(persons.stream()
                .filter(age -> age.getAge() < 21)
                .peek(System.out::println)
                .sorted(Comparator.comparing(Person :: getSurname).thenComparing(Person :: getName))
                .limit(4)
                .map(Person :: getSurname)
                .collect(Collectors.toList()));
    }
    public static class Person {
        private String name;
        private String surname;
        private int age;
        public Person(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }
        @Override
        public String toString() {
            return name + " " + surname + " " + "Возраст: " + age;
        }
        public String getName() {
            return name;
        }
        public String getSurname() {
            return surname;
        }
        public int getAge() {
            return age;
        }
    }

}
