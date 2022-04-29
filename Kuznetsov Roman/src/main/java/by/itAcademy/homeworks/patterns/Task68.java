package by.itAcademy.homeworks.patterns;

import java.time.LocalDate;

class Person{
private String name;
private String surname;
private String yearOfBirth;
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth='" + yearOfBirth + '\'' +
                '}';}
//Тут должны буть геттеры и сеттеры, но я про них явно забыл...
    public static class PersonBuilder{
        private Person person;
        public PersonBuilder(){
            this.person = new Person();
        }
        public PersonBuilder setName(String name){
            person.name = name; //нарушение инкапсуляции
            return this;
        }
        public PersonBuilder setSurname(String surname){
            person.surname = surname;//нарушение инкапсуляции
            return this;
        }
        public PersonBuilder setBirthYear(String yearOfBirth){
            person.yearOfBirth = yearOfBirth;//нарушение инкапсуляции
            return this;
        }
        public Person build(){
            return person;
        }
    }

    }

public class Task68 {
    public static void main(String[] args) {
        System.out.println(new Person.PersonBuilder().setBirthYear("2002").setName("Bebra").setSurname("Bebrow").build());
    }
}
