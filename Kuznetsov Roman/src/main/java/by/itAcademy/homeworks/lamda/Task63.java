package by.itAcademy.homeworks.lamda;

//> Сгенерируйте List коллекцию целых чисел из n элементов от minValue до
//        > maxValue. Определить, содержатся ли в данной коллекции числа, которые делятся и
//        > на 3, и на 5 с помощью stream.


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task63 {
    public static void main(String[] args) {
        int start = 1;
        int end = 10; //тут могла быть ваша реклама
        List<Integer> IntList = Arrays.stream(IntStream.range(start, end).peek(System.out::println).toArray()).boxed().collect(Collectors.toList());
        if (IntList.stream().anyMatch(x->(x%3==0)&&(x%5==0))){
            System.out.println("Кароче, тут точно есть число которое делится на 3 и на 5");
        }
        else{
            System.out.println("Что за подстава, нетут тут чисел, которые делятся на 3 и на 5");
        }
    }
}