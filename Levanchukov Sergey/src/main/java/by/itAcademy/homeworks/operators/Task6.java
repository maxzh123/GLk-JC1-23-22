package by.itAcademy.homeworks.operators;

/**
*> Создайте метод с одним целочисленным параметром. Метод должен
*> определить, является ли последняя цифра числа семеркой и вернуть boolean
*> значение.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a value: ");
        int numb=Integer.parseInt(reader.readLine());
        if (isSeven(numb)==true)
        {
            System.out.println("Last number is seven");
        }
        else
        {
            System.out.println("Last number not seven");
        }

    }
    static boolean isSeven (int numb)
    {
        if (numb%10==7)
        {
            return true;
        }
        else return false;
    }
}
