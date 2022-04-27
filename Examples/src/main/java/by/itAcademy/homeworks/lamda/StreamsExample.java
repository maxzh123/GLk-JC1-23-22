package by.itAcademy.homeworks.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        List<Student> lst=new ArrayList<>();
        lst.add(new Student("Андрей","Д",5,0));
        lst.add(new Student("Валентин","В",51,15));
        lst.add(new Student("Ольга","М",15,7));
        lst.add(new Student("Алина","Д",18,18));
        lst.add(new Student("Влад","Р",41,2));
        lst.add(new Student("Марина","Ф",39,35));
        System.out.println(Stream.of(1,25,6,7).count());
        System.out.println(lst.stream().filter(s->s.getWorks_ok()>5)
                .map(s->s.getWorks()).reduce(0,(sum,works)->sum+=works));
    }
}
