package by.itAcademy.homeworks.reflection;

import java.lang.reflect.Method;

/**Создать собственную аннотацию @AcademyInfo c полем year.
 * Создать метод, помеченный этой аннотацией с заданным year, и метод без нее.
 * С помощью рефлексии проверить наличие данной аннотации у этих методов из основной программы.
 */

public class Task72 {
    public static void main(String[] args) {
        annotationCheck(new Man(30, 200, 222));
    }

    public static void annotationCheck(Man m){
        try {
            Method[] methods = m.getClass().getDeclaredMethods();
            for(Method method: methods) {
                method.setAccessible(true);
                System.out.println("Method: " + method.getName()+ ", Annotation = " + method.getDeclaredAnnotation(AcademyInfo.class));
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}
