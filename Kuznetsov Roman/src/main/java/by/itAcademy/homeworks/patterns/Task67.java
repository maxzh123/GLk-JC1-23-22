package by.itAcademy.homeworks.patterns;

import java.time.LocalDate;

class Singleton{
    private Singleton(){};
    public static String currentTime(){
        return LocalDate.now().toString();
    }

}
class SingletonWithInstance{
    private static SingletonWithInstance instance;
    private SingletonWithInstance(){}; //Запрещаем использование конструктора вне класса, соответственно и создание более, чем одного экземпляра
    public static SingletonWithInstance getInstance(){
        if(instance == null){
            instance = new SingletonWithInstance(); //Тут мы проверяем наличие Instance для Singleton, если его нету - создаем
        }
        return instance;
    }
    public String currentTime(){
        return LocalDate.now().toString();
    }
}
public class Task67 {
    public static void main(String[] args) {
        SingletonWithInstance singletonWithInstance = SingletonWithInstance.getInstance();
        System.out.println("Singleton without instance:" + Singleton.currentTime());
        System.out.println("Singleton with instance:" + singletonWithInstance.currentTime());
    }
}
