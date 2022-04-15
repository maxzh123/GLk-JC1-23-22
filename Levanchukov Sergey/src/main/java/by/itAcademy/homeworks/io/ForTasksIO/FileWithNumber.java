package by.itAcademy.homeworks.io.ForTasksIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FileWithNumber {

    public String readAFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Levanchukov Sergey\\src\\main\\resources\\textFor48.txt"));
        String res = bufferedReader.readLine();
        StringBuilder sb= new StringBuilder();
        while (res!=null){
            sb.append(res);
            res = bufferedReader.readLine();
        }
        return sb.toString();
    }

    public ArrayList<Integer> addToArrayList(String str){
        ArrayList<Integer> number=new ArrayList<>();
        Pattern pattern = Pattern.compile("([0-9]+)");
        Matcher matcher= pattern.matcher(str);
        while (matcher.find()){
            number.add(Integer.valueOf(matcher.group()));
        }
        return number;
    }

    public int sumArray (ArrayList<Integer> arrayList){
        int sum=0;
        for (Integer i:arrayList){
            sum+=i;
        }
        return sum;
    }

    public Set<Integer> searchForRepetitions(ArrayList list){
        Set hashSet=new HashSet<>(list);
        return hashSet;
    }

}
