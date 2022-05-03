package by.itAcademy.homeworks.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task71 {

    /**Task71
     * Создайте класс с методом printHelloWorld(). Вызвать метод с помощью рефлексии из основной программы.
     */

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Man man = new Man();
        printMethodWithReflection(man);
    }

    public static void printMethodWithReflection(Man m) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = m.getClass().getDeclaredMethods();
        for (Method mth:methods) {
            if(mth.getName().equals("printHelloWorld")) {
                mth.invoke(m, "reflection working");
            }
        }
    }
}
