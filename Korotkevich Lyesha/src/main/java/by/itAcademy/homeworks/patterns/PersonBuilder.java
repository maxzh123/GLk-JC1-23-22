package by.itAcademy.homeworks.patterns;

public class PersonBuilder {
    private Person person;

    public PersonBuilder() {
        person = new Person();
    }

    public PersonBuilder setName(String name){
        person.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname){
        person.surname = surname;
        return this;
    }
    public PersonBuilder setBirthYear(int birthYear){
        person.birthYear = birthYear;
        return this;
    }

    public Person build(){
        return person;
    }
}
