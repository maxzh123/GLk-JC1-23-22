package by.itAcademy.homeworks.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**Создать класс Man c произвольным набором полей и методов (не менее 3).
 * Создать метод, который распечатает информацию о классе с помощью рефлексии. Вызвать метод с помощью рефлексии из основной программы.
 * */

public class Task70 {
    public static void main(String[] args) {
        Man man = new Man(18, 60, 180);
        printMethods(man);
        printFields(man);
    }
    public static void printMethods(Man m){
        try {
            Method[] methods = m.getClass().getDeclaredMethods();
            for(Method method: methods) {
                method.setAccessible(true);
                System.out.println("Method: " + method.getName()+ ", Value = " + method.invoke(m));
            }
        } catch (SecurityException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void printFields(Man m){
        try {
            Field[] fields = m.getClass().getDeclaredFields();
            for(Field field: fields) {
                field.setAccessible(true);
                System.out.println("Field: "+ field.getName()+", Value = "+ field.get(m));
            }
        } catch (SecurityException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
