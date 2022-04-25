package by.itAcademy.homeworks.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class   Task63 {

    public static void main(String[] args) {
        List<Student> lst=new ArrayList<>();
        lst.add(new Student("Андрей","Д",5,0));
        lst.add(new Student("Валентин","В",51,15));
        lst.add(new Student("Ольга","М",15,7));
        lst.add(new Student("Алина","Д",18,18));
        lst.add(new Student("Влад","Р",41,2));
        lst.add(new Student("Марина","Ф",39,35));
        System.out.println(lst);
        lst.sort(getComparatorBySName());
        System.out.println(lst);
        lst.sort(getComparatorByName());
        System.out.println(lst);
        lst.sort(getComparatorByWorks());
        System.out.println(lst);
        lst.sort(getComparatorByWorksOk());
        System.out.println(lst);
        lst.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        lst.sort((o1,o2)->Integer.compare(o1.getWorks_ok(), o2.getWorks_ok()));
        System.out.println(lst);
        FuncIfaceExample f=null;

        f= new FuncIfaceExample() {
            @Override
            public long calculate(long x) {
                return (long) Math.pow(2,x);
            }
        };
        f= (long x)->{
            return (long) Math.pow(2,x);
        };
        f= (x)->{
            return (long) Math.pow(2,x);
        };

        f= (long x)->(long) Math.pow(2,x);
        f= (x)->(long) Math.pow(2,x);
        f= x->(long) Math.pow(2,x);
////////////////////////////////////////////////////////////
        VoidIface v= new VoidIface() {
            @Override
            public void func(int a) {
                System.out.println(a);
            }
        };
        v=(int a)->{
            System.out.println(a);
        };
        v=(a)->{
            System.out.println(a);
        };
        v=(a)-> System.out.println(a);
        v=a-> System.out.println(a);
    }

    public static Comparator<Student> getComparatorByName(){
        return new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }
    public static Comparator<Student> getComparatorBySName(){
        return new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getSname().compareTo(o2.getSname());
            }
        };
    }
    public static Comparator<Student> getComparatorByWorks(){
        return new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getWorks(),o2.getWorks());
            }
        };
    }
    public static Comparator<Student> getComparatorByWorksOk(){
        return new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getWorks_ok(),o2.getWorks_ok());
            }
        };
    }

    public static NumProvider getNumProvider(){
        return new NumProvider() {
            @Override
            public int getNum() {
                return 0;
            }
        };
    }



}
