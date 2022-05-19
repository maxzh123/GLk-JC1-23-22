package by.itAcademy.homeworks.FinalTasks.Task4;

import java.io.Serializable;

public class Player implements Serializable {
    public String name;
    public int age;
    public boolean  isActive;

    public Player(String name, int age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Имя " + name + " Возраст " + age + " Активен " + isActive;
    }
}
