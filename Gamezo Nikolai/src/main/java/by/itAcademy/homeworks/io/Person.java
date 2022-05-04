package by.itAcademy.homeworks.io;

public class Person {
    private String name;
    private String surname;
    private int age;
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String toString() {
        return "Имя: " + name + " Фамилия: " + surname + " Возраст: " + age + "\n";
    }
}
