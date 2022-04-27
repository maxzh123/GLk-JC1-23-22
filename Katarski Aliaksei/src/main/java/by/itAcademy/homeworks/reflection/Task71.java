package by.itAcademy.homeworks.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task71 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Man man=new Man();
        printWithReflection(man);
    }
    public static void printWithReflection(Man man) throws InvocationTargetException, IllegalAccessException {
        Method[] methods=man.getClass().getDeclaredMethods();
        for(Method m:methods){
            if(m.getName().equals("printHelloWorld")){
                m.invoke(man,"вызван через рефлексию");
            }
        }
    }
}
