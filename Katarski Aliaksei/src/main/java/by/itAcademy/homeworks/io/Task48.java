package by.itAcademy.homeworks.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  Создать файл с текстом, в котором присутствуют числа. Найти все числа,
 * > вывести на экран, посчитать сумму, убрать все повторяющиеся числа и снова
 * > вывести на экран.
 */
public class Task48 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new FileReader("Katarski Aliaksei/src/main/resources/ForTask48.txt"));
        String a;
        String b="";
        while ((a = reader.readLine()) != null){
            b+=a;
        }
        System.out.println(getNumbersFromFile(b));
        getSumOfElements(getNumbersFromFile(b));
        getNonRepeatableElements(getNumbersFromFile(b));
    }

    public static List<Integer> getNumbersFromFile(String str){
        List<Integer> numbersList=new ArrayList<>();
        Pattern p=Pattern.compile("[0-9]+",Pattern.MULTILINE);
        Matcher m=p.matcher(str);
        while (m.find()){
            numbersList.add(Integer.valueOf(m.group()));
        }

        return numbersList;
    }
    public static int getSumOfElements(List<Integer> list){
        int sum=0;
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            sum+=iterator.next();
        }
        System.out.println("Сумма элементов : "+sum);
        return sum;
    }
    public static List<Integer> getNonRepeatableElements(List<Integer> list){
        List<Integer> nonRepeatList=new ArrayList<>();
        Iterator<Integer> iterator=list.iterator();
        for(int i=0;i<list.size();i++){
            if(!nonRepeatList.contains(list.get(i))){
                nonRepeatList.add(list.get(i));
            }
        }
        System.out.println(nonRepeatList);
        return nonRepeatList;
    }
}
