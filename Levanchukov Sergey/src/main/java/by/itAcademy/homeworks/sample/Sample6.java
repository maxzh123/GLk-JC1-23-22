package by.itAcademy.homeworks.sample;

/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает.
3. Челенж. Переделываем, так что количество вычислений остатка от деления было как можно меньше. Посмотрим у кого что получится.
* */
public class Sample6 {
    private static int count=0;
       public static void main (String[] arg){
        for (int i=1;i<=1000;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
        System.out.println("Произвели сравнений остатка от деления:"+count);
    }
    private static boolean isPrime(int number){
        if (number==0 || number==1 || number==2){
            return true;
        }else{
            for(int i=2;i<number;i++){
                count++;
                if (number%i==0){
                    return false;
                }
            }
        }
        return true;
    }

}