package by.itAcademy.homeworks.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task48 {

    /**Task48
     * Создать файл с текстом, в котором присутствуют числа.
     * Найти все числа, вывести на экран, посчитать сумму, убрать все повторяющиеся числа и снова вывести на экран.
     */

    public static void main(String[] args) throws IOException {
        String str = "";
        BufferedReader br = new BufferedReader(new FileReader("Borysenka_Aksana\\src\\main\\resources\\ForTask48.txt"));
        try {
            String strBr = br.readLine();
            while (strBr != null) {
                str += strBr + "\n";
                strBr = br.readLine();
            }
        }catch(IOException e){
                e.printStackTrace();
            }
        System.out.println("Your text" + "\n" + str);
        System.out.println("All numbers: " + getNumbers(str));
        System.out.println("Amount numbers in the text: " + sumNumbers(getNumbers(str)));
        System.out.println("All numbers without duplicate numbers: " + getNumbersWithoutDuplicate(getNumbers(str)));
        System.out.println("Amount numbers in the text without duplicate numbers:  " + sumNumbers(getNumbersWithoutDuplicate(getNumbers(str))));

        br.close();
        }

    public static List<Integer> getNumbers(String str) {
        List<Integer> lst = new ArrayList<>();
        Pattern p = Pattern.compile("[0-9]+", Pattern.MULTILINE);
        Matcher m = p.matcher(str);
        while (m.find()){
            try {
                int x = Integer.parseInt(m.group());
                lst.add(x);
            }catch(NumberFormatException nfe){
                nfe.printStackTrace();
            }
        }
        return lst;
    }

    public static int sumNumbers(List<Integer> lst){
        int sum = 0;
        for (int x:lst) {
            sum  += x;
        }
        return sum;
    }

    public static List<Integer> getNumbersWithoutDuplicate(List<Integer> l){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            if (!list.contains(l.get(i))){
                list.add(l.get(i));
            }
        }
        return list;
    }

}


