package by.itAcademy.homeworks.patterns;

import java.util.Scanner;

public class Task68 {

    /**Task68
     * Создайте класс Person с полями: имя, фамилия, год рождения.
     * Реализуйте у этого класса паттерн Строитель.
     * Введите поля с клавиатуры и заполните объект класса Person с помощью паттерна Строитель.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name, surname and age in order");
        PersonForTask68 p = new PersonForTask68.PersonBuilder()
                .getFirstName(in.nextLine())
                .getSurName(in.nextLine())
                .getAge(in.nextInt())
                .build();
        System.out.println(p);
    }
}
