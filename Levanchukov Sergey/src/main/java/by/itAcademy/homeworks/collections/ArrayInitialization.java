package by.itAcademy.homeworks.collections;

import java.util.*;

public class ArrayInitialization {
    List<Integer> arrayOfMarks=new ArrayList<>();

    private int count;//количество оценок

    public void setCount(int count) {
        this.count = count;
    }

    //инициализируем указанно количество оценок
    public List<Integer> arrayInitialization () {
        List<Integer> marks=new ArrayList<>();
        for (int i=0;i<count;i++)
        {
            marks.add((int) (Math.random()*10));
        }
        return marks;
    }

    public void printArrayList(List<Integer> list){
        System.out.println(list);
    }

    //удаление элемента меньше 4
    public List<Integer> deleteUnsatisfiedRatings(List<Integer> list){
        list=arrayInitialization();
        for (int i=0;i<list.size();i++)
            if(list.get(i)<4){
                list.remove(i);
                i--;
            }
        return list;
    }

    public void deleteRecurringNumbers(){
        HashSet<Integer> withoutRecurring= new HashSet<>();
        List <Integer> newList=arrayInitialization();
        for (int i=0;i<newList.size(); i++){
            withoutRecurring.add(i);
        }
        printArrayList(newList);
    }

}
