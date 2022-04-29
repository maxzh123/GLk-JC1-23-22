package by.itAcademy.homeworks.patterns;

/**
 * > Создайте класс Person с полями: имя, фамилия, год рождения. Реализуйте у
 * > этого класса паттерн Строитель. Введите поля с клавиатуры и заполните объект
 * > класса Person с помощью паттерна Строитель.
 */
class Person {
    private String name;
    private String sName;
    private String age;

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", sName='" + sName + '\'' + ", age='" + age + '\'' + '}';
    }

    private Person(PersonBuilder personBuilder) {
        this.name = personBuilder.getName();
        this.sName = personBuilder.sName;
        this.age = personBuilder.getAge();

    }

    static class PersonBuilder {
        private String name;
        private String sName;
        private String age;

        public String getName() {
            return name;
        }

        public String getsName() {
            return sName;
        }

        public String getAge() {
            return age;
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder sName(String sName) {
            this.sName = sName;
            return this;
        }

        public PersonBuilder age(String age) {
            this.age = age;
            return this;
        }
        public Person build(){
            return new Person(this);
        }

    }
}
public class Task68 {
    public static void main(String[] args) {
        Person p= new Person.PersonBuilder()
                .age("12")
                .name("Alex")
//                .sName("Katarskiy")
                .build();
        System.out.println(p);
    }
}
