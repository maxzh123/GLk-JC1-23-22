package by.itAcademy.homeworks.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Task70 {

    /**Task70
     * Создать класс Man c произвольным набором полей и методов (не менее 3).
     * Создать метод, который распечатает информацию о классе с помощью рефлексии.
     * Вызвать метод с помощью рефлексии из основной программы.
     */

    public static void main(String[] args) {
        Man man = new Man();
        getFieldsClassWithReflection(man);
        getMethodsClassWithReflection(man);
    }

    public static void getFieldsClassWithReflection(Man m){
        Field[] fields = m.getClass().getDeclaredFields();
        for (Field f: fields ) {
            f.setAccessible(true);
            try{
                System.out.println("Field: " + f.getName() + ". Field value: " + f.get(m));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static void getMethodsClassWithReflection(Man m){
        Method[] methods = m.getClass().getDeclaredMethods();
        for (Method mth: methods ) {
            mth.setAccessible(true);
            System.out.println("Method: " + mth.getName());
        }
    }
}
