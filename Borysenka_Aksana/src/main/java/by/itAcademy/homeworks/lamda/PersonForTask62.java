package by.itAcademy.homeworks.lamda;

public class PersonForTask62 {


    private String name;
    private String surName;
    private int age;

    public PersonForTask62(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonForTask62:" + name +" "+  surName + ", " + age;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }
}
