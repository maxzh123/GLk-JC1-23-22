package by.itAcademy.homeworks.loops;

public class Task14 {
    public static void main(String[] args) {
        long numb = 7_893_823_445L;
        System.out.println(sumCalculation(numb));
    }

    public static int sumCalculation(long numb) {
        int sum = 0;
        do {
            sum += numb % 10;
            numb/=10;
        } while (numb>0);
        return sum;

     }

}
