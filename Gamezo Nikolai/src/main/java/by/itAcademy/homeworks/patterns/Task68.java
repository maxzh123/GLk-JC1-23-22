package by.itAcademy.homeworks.patterns;

import java.util.Scanner;

/**
 * Задание 68
 * Создайте класс Person с полями: имя, фамилия, год рождения. Реализуйте у этого класса паттерн Строитель.
 * Введите поля с клавиатуры и заполните объект класса Person с помощью паттерна Строитель.
 */

public class Task68 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите фамилию: ");
        String surname = in.nextLine();
        System.out.print("Введите год рождения: ");
        int birthYear = in.nextInt();
        Person person = new Person.PersonBuilder().setName(name).setSurname(surname).setBirthYear(birthYear).build();
        System.out.println("\n" + person);
    }
}
