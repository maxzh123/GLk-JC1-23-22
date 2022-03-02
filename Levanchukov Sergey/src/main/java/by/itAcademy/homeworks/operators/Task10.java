package by.itAcademy.homeworks.operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f.
 * Проверить, помещаются ли эти дома на данном участке. Стороны домов –
 * параллельны сторонам участка, в остальном размещение может быть любым.
 **/

public class Task10 {
    public static void main(String[] args) {
        int sideAHouse1,sideBHouse1,sideCHouse2,sideDHouse2,sideEArea,sideFArea;
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите размер первого дома");
        sideAHouse1= sc.nextInt();
        sideBHouse1= sc.nextInt();
        System.out.println("Введите размер второго дома ");
        sideCHouse2= sc.nextInt();
        sideDHouse2= sc.nextInt();
        System.out.println("Введите размер зоны");
        sideEArea= sc.nextInt();
        sideFArea= sc.nextInt();
        if (sideAHouse1<=sideEArea && sideBHouse1<=sideFArea || sideAHouse1<=sideFArea&&sideBHouse1<=sideEArea) {
            System.out.println("Первый дом помещается в зоне");
        }else System.out.println("Первый дом не помещается");
        if (sideCHouse2<=sideEArea && sideDHouse2<=sideFArea || sideCHouse2<=sideFArea&&sideDHouse2<=sideEArea){
            System.out.println("Второй дом помещается в зоне");
        }else System.out.println("Второй дом не помещается");
    }
    }
