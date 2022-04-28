package by.itAcademy.homeworks.lamda;

import java.util.stream.IntStream;

public class Task61 {
    public static void main(String[] args) {
        System.out.println(
                IntStream.rangeClosed(1, 20)
                        .filter(x->(x%2==0))
                        .peek(System.out::println)
                        .mapToDouble(x->(x*2.54)).sum()
        );
    }
}
