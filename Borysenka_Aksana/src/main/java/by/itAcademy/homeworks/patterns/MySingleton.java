package by.itAcademy.homeworks.patterns;

import java.time.LocalDate;

<<<<<<< HEAD
public class MySingleton {
    private static MySingleton example = new MySingleton();
    private final LocalDate ld = LocalDate.now();

    public LocalDate getLd() {
        return ld;
    }

    public MySingleton() {}

public static MySingleton getExample(){
        return example;
}


    //для многопотока
//    public static MySingleton getExample(){
//        if(example == null){
//            synchronized (MySingleton.class){
//                if(example == null) {
//                    example = new MySingleton();
//                }
//            }
//        }
//        return example;
//    }
=======
public enum  MySingleton {
    example;

    private final LocalDate now=LocalDate.now();
    public LocalDate getNow() {
        return now;
    }
>>>>>>> cf6323eb23165e56ff2e7b3b8ca7f1e15b56c1fe

    // если объект создается двумя разными потоками одновременно,
    // может возникнуть ситуация, когда они почти одновременно пройдут условие и
    // new  будет выполнен два раза, решение - синхронизаия метода ниже


}
