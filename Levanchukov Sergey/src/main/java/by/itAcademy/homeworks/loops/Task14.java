package by.itAcademy.homeworks.loops;
/**Посчитать сумму цифр числа 7893823445 с помощью цикла do while*/
public class Task14 {
    public static void main(String[] args) {
        int sum=0; int i=1;
        long numb=7893823445L;
        do {
            sum+=numb%10;
            numb/=10;
            i++;
        } while (i<11);
        System.out.println("Сумма = "+sum);
    }
}
