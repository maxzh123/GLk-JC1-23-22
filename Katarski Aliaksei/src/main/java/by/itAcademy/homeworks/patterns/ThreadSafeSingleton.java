package by.itAcademy.homeworks.patterns;

import java.time.LocalDate;

public class ThreadSafeSingleton {

        private static ThreadSafeSingleton instance;

        private ThreadSafeSingleton(){}

        public static synchronized ThreadSafeSingleton getInstance(){
            if(instance == null){
                instance = new ThreadSafeSingleton();
            }
            return instance;
        }


    public void getCurrentDate(){
        System.out.println(LocalDate.now());
    }
}

