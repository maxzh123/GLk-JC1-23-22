package by.itAcademy.homeworks.objects;

import java.util.Arrays;

public class Task24 {

    public static void main(String[] args) {

        User петр=new User("Петр","Петров","",1983);
        User павел=new SuperUser("Павел","Сидоров","",1983);

        //User[] учеткадров=null;
        //Arrays.sort(учеткадров);
        System.out.println(петр.equals(павел));
        System.out.println(петр);
        System.out.println(павел);
        System.out.println(петр);
        System.out.println(павел);
    }


}
