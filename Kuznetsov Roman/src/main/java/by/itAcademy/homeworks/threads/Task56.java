package by.itAcademy.homeworks.threads;


class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void stateYourName(Person person) throws InterruptedException {
        Thread.sleep(1000);
        person.stateYourNameBack(this);
        this.stateYourNameBack(person);
    }

    public synchronized void stateYourNameBack(Person person) {
        System.out.println("Меня зовут " + person.getName());
    }
}
class Acquaintance implements Runnable{
    private final Person person, otherPerson;

    public Acquaintance(Person person, Person otherPerson) {
        this.person = person;
        this.otherPerson = otherPerson;
    }

    @Override
    public void run() {
        try {
            person.stateYourName(otherPerson);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Task56 {
    public static void main(String[] args) throws InterruptedException {
        Person[] people = {new Person("Миша"), new Person("Дима"), new Person("Коля")};
        Acquaintance[] acquaintances = {new Acquaintance(people[0], people[1]), new Acquaintance(people[1], people[2]), new Acquaintance(people[2], people[0])};
        Thread[] threads = {new Thread(acquaintances[0]), new Thread(acquaintances[1]), new Thread(acquaintances[2])};
        for (Thread thread : threads) {
            thread.start();
        }
        if (threads[0].isAlive() && threads[1].isAlive() && threads[2].isAlive()) {
            System.out.println("Deadlock :c");
        }
    }
}
