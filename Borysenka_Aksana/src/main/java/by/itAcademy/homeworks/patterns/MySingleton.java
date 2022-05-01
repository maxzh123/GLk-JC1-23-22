package by.itAcademy.homeworks.patterns;

import java.time.LocalDate;

public class MySingleton {
    private static MySingleton example;

    public MySingleton() {}

    public static MySingleton getExample(){
        if(example == null){
            example = new MySingleton();
        }
        return example;
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

    public void getCurrentDate(){
        System.out.println(LocalDate.now());
    }
}
