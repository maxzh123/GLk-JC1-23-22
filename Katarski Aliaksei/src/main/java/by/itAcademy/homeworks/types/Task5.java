package by.itAcademy.homeworks.types;
/**Задать промежуток времени в секундах в виде переменной. Следует вывести
        > его на экран в виде часов минут и секунд, суток и недель.
*/

public class Task5 {
public static void main(String[] args){
    int sec=12342576;
    System.out.println(sec/3600+" часов");
    System.out.println(sec/60+" минут");
    System.out.println(sec+" секунд");
    System.out.println(sec/86400+" суток");
    System.out.println(sec/604800+" недель");
}
}
