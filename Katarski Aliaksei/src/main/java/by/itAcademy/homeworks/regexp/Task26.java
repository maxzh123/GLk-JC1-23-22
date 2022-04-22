package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Написать регулярку,которая находит все знаки препинания.посчитать их кол-во.
 */
public class Task26 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String string=sc.nextLine();
    punctMarks(string);
    }

   public static int punctMarks(String string){
        int count=0;
       Pattern p=Pattern.compile("([.]{3}|\\.{1}|\\,)|([!?]{1,3})|[;:()]");
       Matcher m=p.matcher(string);
       while (m.find()){
           count++;
       }
       System.out.println(count);
       return count;
   }
}
