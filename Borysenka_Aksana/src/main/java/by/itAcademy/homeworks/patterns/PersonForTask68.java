package by.itAcademy.homeworks.patterns;

import by.itAcademy.homeworks.io.Person;

public class PersonForTask68 {
    private String name;
    private String surName;
    private int age;


    @Override
    public String toString() {
        return "PersonForTask68: " +
                "name = " + name +
                ", surName = " + surName +
                ", age = " + age ;
    }

    public static class PersonBuilder{
        private PersonForTask68 person;

        public PersonBuilder(){
            person = new PersonForTask68();
        }

        public PersonBuilder getFirstName(String name) {
            person.name = name;
            return this;
        }

        public PersonBuilder getSurName(String surName) {
            person.surName = surName;
            return this;
        }

        public PersonBuilder getAge(int age) {
            person.age = age;
            return this;
        }

        public PersonForTask68 build(){
            return person;
        }
    }
}
