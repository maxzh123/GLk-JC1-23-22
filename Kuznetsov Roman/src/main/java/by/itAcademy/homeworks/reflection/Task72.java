package by.itAcademy.homeworks.reflection;

import java.lang.reflect.Method;

class Test{
    @AcademyInfo(year = 2000)
    public void testTwo() {
    }
    public void testOne() {
    }
}
public class Task72 {
    public static void main(String[] args) {
        annotationCheck(new Test());
    }
    public static void annotationCheck(Object obj) {
        Method[] methods = obj.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(AcademyInfo.class)) {
                System.out.println(method.getName() + " с аннотацией @AcademyInfo");
            } else System.out.println(method.getName() + " без аннотации @AcademyInfo");
        }
    }
}
