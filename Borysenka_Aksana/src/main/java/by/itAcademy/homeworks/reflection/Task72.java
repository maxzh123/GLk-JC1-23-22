package by.itAcademy.homeworks.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Task72 {

    /** Task72
     *  Создать собственную аннотацию @AcademyInfo c полем year. Создать метод,
     *  помеченный этой аннотацией с заданным year, и метод без нее.
     *  С помощью рефлексии проверить наличие данной аннотации у этих методов из основной программы.
     */

    public static void main(String[] args) {
        Man man = new Man();
        getMethodWithAnnottationWithReflection(man);
    }

    public static void getMethodWithAnnottationWithReflection(Man m){
//        Annotation[] annotations = m.getClass().getDeclaredAnnotations();
        Method[] methods = m.getClass().getDeclaredMethods();
        for (Method mth:methods) {
            if(mth.isAnnotationPresent(AcademyInfo.class)){
                System.out.println(mth.getName() + " method with annotation");
            }else {
                System.out.println(mth.getName() + " method without annotation");
            }
        }
    }
}
