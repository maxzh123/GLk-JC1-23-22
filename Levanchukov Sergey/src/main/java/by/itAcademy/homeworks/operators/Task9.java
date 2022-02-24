package by.itAcademy.homeworks.operators;
/**
*Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task9 {
    public static void main(String[] args) throws IOException {
        //Date date =new Date();
        //System.out.println(date);
        Calendar calendar=new GregorianCalendar();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        int day=Integer.parseInt(reader.readLine());
        int month=Integer.parseInt(reader.readLine());
        int year=Integer.parseInt(reader.readLine());

        calendar.set(Calendar.DAY_OF_MONTH,day);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)+1);//не очень понял почему так, но idea так поправила + инфа в интернете

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)+" "+calendar.get(Calendar.MONTH)+" "+calendar.get(Calendar.YEAR));


       // System.out.println(calendar.getTime());
    }
}
