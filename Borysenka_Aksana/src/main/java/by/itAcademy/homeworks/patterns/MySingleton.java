package by.itAcademy.homeworks.patterns;

import java.time.LocalDate;

public enum  MySingleton {
    example;

    private final LocalDate now=LocalDate.now();
    public LocalDate getNow() {
        return now;
    }

    // если объект создается двумя разными потоками одновременно,
    // может возникнуть ситуация, когда они почти одновременно пройдут условие и
    // new  будет выполнен два раза, решение - синхронизаия метода ниже

//    public static synchronized MySingleton getExample(){
//        if(example == null){
//            example = new MySingleton();
//        }
//        return example;
//    }

}
