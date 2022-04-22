package by.itAcademy.homeworks.loops;

import java.text.DecimalFormat;

public class Task17 {

    /**
     * Задать произвольное целое число и вывести его в бухгалтерском формате,
     * то есть, начиная справа, каждые три позиции отделяются пробелом.
     * Например, число 20023143 должно быть выведено как 20 023 143.
     */

    public static void main (String[] args) {
        //лентяйский вариант
//    System.out.println(new DecimalFormat("###,###").format(Math.random()*1000000000));

        long l = -23_456_789;
            String str = "" + l;
            System.out.println("Your number:" + str);
            System.out.println("Your formatted number:" + addSpacetoString(str));
    }



    public  static String addSpacetoString (String str){

        StringBuffer sb = new StringBuffer(str);
        if (sb.charAt(0) == '-'){
            sb.deleteCharAt(0);
        }
        sb.reverse();
        for (int i=sb.length(); i>0; i--){
            if (i%3 == 0 && i!=sb.length()){
                sb.insert(i, " ");
            }
        }

        sb.reverse();
        if (str.charAt(0) == '-'){
            sb.insert(0,"-");
        }

        return sb.toString();
    }

}

