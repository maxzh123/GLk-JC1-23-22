package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

public class Task18 {

    public static void main(String[] args) {
        int i=3;
        System.out.println( (i>4)?"Да":"Нет");

        if(check(3) & check(5)){
            System.out.println("Yes");
        }

    }

    public static boolean check(int x){
        System.out.println(x);
        return x>5;
    }


}
