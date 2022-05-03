package by.itAcademy.homeworks.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**Создайте класс с методом printHelloWorld(). Вызвать метод с помощью рефлексии из основной программы.*/

public class Task71 {
    public static void main(String[] args) {
        Man man = new Man(20, 70, 185);
        try {
            Method method = man.getClass().getDeclaredMethod("printHelloWorld");
            method.setAccessible(true);
            method.invoke(man);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
