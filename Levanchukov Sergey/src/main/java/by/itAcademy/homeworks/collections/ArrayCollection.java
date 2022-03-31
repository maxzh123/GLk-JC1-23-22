package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayCollection {

    private List<Integer> list=new ArrayList<>();

    public List<Integer> getList() {
        return list;
    }

    //инициализация коллекций
    public List<Integer> arrayInitialization ( int count) {
        for (int i=0;i<count;i++) {
            list.add((int)(Math.random()*10));
        }
        return list;
    }

    //печать коллекции
    public void printArray(){
        for (Integer i:list) {
            System.out.print(i);
        }
    }

    //удаляет оценки ниже 4
    public List<Integer> deleteUnsatisfiedRatings() {
        for (int i=0;i<list.size();i++){
            if(list.get(i)<=4){
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    //создает копию коллекции и удаляет повторы
    public List<Integer> deleteRecurringNumbers(){
        List <Integer> copyList=new ArrayList<>();
        copyList=list;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < copyList.size(); j++) {
                if(list.get(i)==list.get(j)){
                    copyList.remove(i);
                    j--;
                }
            }
        }
        return list=copyList;
    }

    //нахождение наибольшего элемента
    public void choosingTheLargest (List<Integer>choosing){
        Iterator<Integer> iterator=choosing.iterator();
        int max=choosing.get(0);
        while (iterator.hasNext()){
            int a=iterator.next();
            if(max>a){
                max=a;
            }
        }
        System.out.println("Max value: "+max);
    }

}
