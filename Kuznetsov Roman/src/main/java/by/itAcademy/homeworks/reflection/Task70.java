package by.itAcademy.homeworks.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Man{
    private String name;
    private String surname;
    private int Age;
    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Age=" + Age +
                '}';
    }

    public Man(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        Age = age;
    }

    private void printFields() {
        System.out.println("Поля Man:");
        for (Field field : Man.class.getDeclaredFields()) {
            System.out.println("Поле: " + field.getName() + ", тип: " + field.getType());
        }
    }
    private void printMethods() {
        System.out.println("Методы Man:");
        for (Method method : Man.class.getDeclaredMethods()) {
            System.out.println("Метод " + method.getName() + ", тип возвращаемого значения: " + method.getReturnType());
        }
    }
    private void printHelloWorld() {
        System.out.println("Ты как меня вызвал шизоид?");
    }
}
public class Task70 {
    public static void main(String[] args) {
        Man man = new Man("Андрей", "Бэбров",12);
        ReflectionMethodCall(man, "printFields");
        ReflectionMethodCall(man, "printMethods");
    }
    public static void ReflectionMethodCall(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getDeclaredMethod(methodName);
            method.setAccessible(true);
            method.invoke(obj);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
