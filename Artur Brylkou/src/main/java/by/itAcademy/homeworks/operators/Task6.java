package by.itAcademy.homeworks.operators;

public class Task6 {
    public static void main(String[] args) {
        int number =(int) (Math.random()*100);
        checkNumber(number);
    }
    private static void checkNumber(int number){
        if(number % 10 == 7){
            System.out.println("Число " +number+ " заканчивается на 7");
        }
        else
            System.out.println("Число " +number+ " не заканчивается га 7");
    }
}
