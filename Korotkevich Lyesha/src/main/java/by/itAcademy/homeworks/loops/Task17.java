package by.itAcademy.homeworks.loops;
import java.text.DecimalFormat;

public class Task17 {
    public static void main(String[] args){
        format(200239898143L);
    }
    public static void format(long num){
        System.out.println(new DecimalFormat( "###,###.##" ).format(num));
    }
}
