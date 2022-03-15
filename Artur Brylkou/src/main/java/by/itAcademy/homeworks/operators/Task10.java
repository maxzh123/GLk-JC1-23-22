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
        System.out.println(chekIn(sideA, sideB, sideC, sideD, sideE, sideF));
    }

    public static String chekIn(int a, int b, int c, int d, int e, int f) {
        if (a > 0 && b > 0 && c > 0 && d > 0 && f > 0 && e > 0) {
            if (e < f) {
                return eLessf(a, b, c, d, e, f);
            } else {
                return eThanf(a, b, c, d, e, f);
            }
        }else return "Ошибка";
    }

    public static String eLessf(int a, int b, int c, int d, int e, int f) {
        if (f > (a + b) && e > b && e > d) {
        }
        if (f > (a + d) && e > b && e > c) {
        }
        if (f > (b + c) && e > a && e > d) {
        }
        if (f > (b + d) && e > a && e > c) {
            return "Дома помещаются";
        } else return "Дома не помещаются";
    }

    public static String eThanf(int a, int b, int c, int d, int e, int f) {
        if (e > (a + b) && f > b && f > d) {
        }
        if (e > (a + d) && f > b && f > c) {
        }
        if (e > (b + c) && f > a && f > d) {
        }
        if (e > (b + d) && f > a && f > c) {
            return "Дома помещаются";
        } else return "Дома не помещаются";
    }
}