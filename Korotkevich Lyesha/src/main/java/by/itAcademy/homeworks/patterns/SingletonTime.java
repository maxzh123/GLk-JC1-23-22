package by.itAcademy.homeworks.patterns;

import java.time.LocalDate;

public class SingletonTime {
    private static SingletonTime instance;

    private SingletonTime() {
    }

    public static SingletonTime getDate(){
            if (instance == null) {
                instance = new SingletonTime();
            }
            return instance;
    }

    public static LocalDate getCurrentDate(){
        return LocalDate.now();
    }
}
