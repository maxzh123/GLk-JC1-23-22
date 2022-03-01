package by.itAcademy.homeworks.loops;
/**Посчитать сумму цифр числа 7893823445 с помощью цикла do while*/

public class Task14 {
public static void main(String[] args){
    System.out.print(summ(7893823445l));
}

    public static long summ(long n) {
        long number=0;
        do{
            number+=n%10;
            n/=10;
        }while(n!=0);
        return number;
    }
}
