package by.itAcademy.homeworks.loops;

import java.text.NumberFormat;

public class Task17 {
    public static void main(String[] args) {
        int number = -523100356;
        if (number > 0) {
            System.out.println(numberPlus(number));
        }
        if (number < 0) {
            System.out.println(numberMinus(number));
        }
        if (number == 0) {
            System.out.println("0");
        }
    }
        public static String numberPlus(int number){
            String rezult = "";
            do {
                rezult = number % 1000 + " " + rezult;
                number = number / 1000;
            } while (number > 0);
            return rezult;
        }
        public static String numberMinus(int number){
        String rezult = "";
        do {
            rezult = (number % 1000*(-1)) + " " + rezult;
            number = number / 1000;
        } while (number <0);
        return "-" + rezult;
    }


}