package by.itAcademy.homeworks.patterns;

/**Создайте класс Person с полями: имя, фамилия, год рождения. Реализуйте у этого класса паттерн Строитель.
 * Введите поля с клавиатуры и заполните объект класса Person с помощью паттерна Строитель.
 */

public class Task68 {
    public static void main(String[] args) {
        Person p = new PersonBuilder()
                .setName("Lyesha")
                .setSurname("Korotkevich")
                .setBirthYear(2003)
                .build();
        System.out.println(p);
    }
}
