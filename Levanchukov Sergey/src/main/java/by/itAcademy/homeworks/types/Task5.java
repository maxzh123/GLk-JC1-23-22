package by.itAcademy.homeworks.types;

/*> Задать промежуток времени в секундах в виде переменной. Следует вывести
> его на экран в виде часов минут и секунд, суток и недель. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number in seconds");
        int sec=Integer.parseInt(reader.readLine());
        converterToHours(sec);
    }
    static void converterToHours (int a){
        System.out.println("Hours: "+a/3600);
        System.out.println("Minutes: "+a/60);
        System.out.println("Seconds: "+a);
        System.out.println("Days: "+a/86400);
        System.out.println("Weeks: "+a/604800);
    }
}
