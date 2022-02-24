package by.itAcademy.homeworks.operators;

/*
> Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
> Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже
> целое число).
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    private static class Circle{
        int a,b,r;
    }

    static void Circle (int a,int b,int r){
        if (r*2>=Math.sqrt((Math.pow(a,2)+Math.pow(b,2)))){
            System.out.println("Картонка радиусом "+r+" закрывает прямоугольное отверстие со сторонами a="+a+" b="+b+".");
        }
        else {
            System.out.println("Картонка не закрывает прямоугольное отверстие");
        }
    }
    static Circle value() throws IOException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Circle result=new Circle();
        result.a=Integer.parseInt(reader.readLine());
        result.b=Integer.parseInt(reader.readLine());
        result.r=Integer.parseInt(reader.readLine());
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        int r=Integer.parseInt(reader.readLine());
        Circle(a,b,r);


    }

}
