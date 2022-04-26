package by.itAcademy.homeworks.reflection;

import java.lang.reflect.Field;

/**
 * Создать класс Man c произвольным набором полей и методов (не менее 3).
 * > Создать метод, который распечатает информацию о классе с помощью рефлексии.
 * > Вызвать метод с помощью рефлексии из основной программы.
 */

public class Task70 {
    public static void main(String[] args) throws IllegalAccessException {
        Man man=new Man();
        getInfoWithReflection(man);
}

    public static void getInfoWithReflection(Man man){
        Field[] fields=man.getClass().getDeclaredFields();
        for(Field f:fields){
            f.setAccessible(true);
            try {
                System.out.println("Имя поля : "+f.getName()+" Значение : "+f.get(man));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
