package by.itAcademy.homeworks.operators;


import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SideA");
        int sideA = sc.nextInt();
        System.out.println("SideB");
        int sideB = sc.nextInt();
        System.out.println("SideC");
        int sideC = sc.nextInt();
        System.out.println("SideD");
        int sideD = sc.nextInt();
        System.out.println("SideE");
        int sideE = sc.nextInt();
        System.out.println("SideF");
        int sideF = sc.nextInt();
        System.out.println(chekIn(sideA,sideB,sideC,sideD,sideE,sideF));
    }
    public static String chekIn(int a, int b, int c, int d, int e, int f) {
        if ((a + c) <= e && b <= f && d <= f) {
            if ((a+b) <= f && b <= e && d <= e)
        return ("Дома помещаются");
                } else return "Дома не помещаются";


        return "Дома помещаются";
    }
}
