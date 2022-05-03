package by.itAcademy.homeworks.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task63 {

    /**Task63
     * Сгенерируйте List коллекцию целых чисел из n элементов от minValue до maxValue.
     * Определить, содержатся ли в данной коллекции числа, которые делятся и на 3, и на 5 с помощью stream.
     */

    public static void main(String[] args) {
        int minValue = 0;
        int maxValue = 100;

        List<Integer> lst = new ArrayList<>(IntStream.range(minValue, maxValue).peek(System.out::println).boxed().collect(Collectors.toList()));
        if(lst.stream().anyMatch(x -> (x%3==0)&&(x%5==0))){
            System.out.println("Числа которые делятся на 3 и на 5:");
            lst.stream().filter(x -> (x%3==0)&&(x%5==0)).forEach(System.out::println);
        }else {
            System.out.println("Нет чисел, которые делятся на 3 и на 5");
        }
    }
}




//    List<Integer> lst = new ArrayList<>();
//        for(int i = 0; i <= maxValue; i++) {
//                lst.add(i);
//                }
//
//                System.out.println(lst.stream()
//                .filter(x -> x % 3 == 0 && x%5 == 0)
//                .collect(Collectors.toList())
//                );

//        List<Integer> l = Arrays.stream(IntStream.rangeClosed(minValue, maxValue).peek(System.out::println).toArray()).boxed().collect(Collectors.toList());