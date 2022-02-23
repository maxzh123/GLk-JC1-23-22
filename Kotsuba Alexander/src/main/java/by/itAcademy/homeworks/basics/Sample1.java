package by.itAcademy.homeworks.basics;

import java.util.Scanner;

public class Sample1 {
    /* Задание:
1. запустить убедится, что работает.
2. внести хоть какие-то изменения, которые меняют результат. и заставить это работать.
* */
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
         Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение х: ");
        int x = sc.nextInt();
        System.out.println("Вы ввели: " + x);
        }

    }



