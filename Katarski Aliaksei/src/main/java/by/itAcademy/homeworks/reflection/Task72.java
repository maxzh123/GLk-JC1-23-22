package by.itAcademy.homeworks.reflection;
/**
 * Создать собственную аннотацию @AcademyInfo c полем year. Создать метод,
 * > помеченный этой аннотацией с заданным year, и метод без нее. С помощью
 * > рефлексии проверить наличие данной аннотации у этих методов из основной
 * > программы.
 */

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Task72 {
    public static void main(String[] args) {
        Man man=new Man();
        Annotation[] annotations=man.getClass().getDeclaredAnnotations();
        Method[] methods=man.getClass().getDeclaredMethods();
        for(Method m:methods){
            if(m.isAnnotationPresent(AcademyInfo.class)){
                System.out.println(m.getName()+" с аннотацией");
            }else System.out.println(m.getName()+" без аннотации");
        }
    }
}


