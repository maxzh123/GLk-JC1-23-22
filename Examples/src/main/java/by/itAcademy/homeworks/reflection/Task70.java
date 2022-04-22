package by.itAcademy.homeworks.reflection;


import by.itAcademy.homeworks.objects.SuperUser;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Task70 {
    public static void main(String[] args) {
        Оксана o=new Оксана();
        телефонКоторыйВидитСквозьОдежду(o);
        телефонКоторыйВидитСквозьОдежду(new SuperUser("234","444","444",333));
//        System.out.println("Возраст:"+o.getВозраст());
    }

    static void телефонКоторыйВидитСквозьОдежду(Object o){
        Field[] fields=o.getClass().getDeclaredFields();
        for (Field f :fields) {
            System.out.print("Поле:"+f.getName());
            System.out.print(" тип:"+f.getType());
            f.setAccessible(true);
            try {
                System.out.print(" значение:"+f.get(o));
                if (f.getName().equals("возраст")){
                    f.setInt(o,42);
                }
            } catch (IllegalAccessException e) {
                System.out.print("От нас что-то скрывают!!!!");
            }
            System.out.println("");
        }
        Method[] methods=o.getClass().getDeclaredMethods();
        for (Method m:methods){
            System.out.print(m.getName());
            try {
                m.invoke(o);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }


    }
}
