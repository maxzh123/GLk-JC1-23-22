package by.itAcademy.homeworks.basics;

public class IsPrimeChallange {
        private static int count=0;
    private static int nums=0;
        public static void main (String[] arg){
            for (int i=1;i<=100000;i++){
                if (isPrime(i)){
                    nums++;
                    System.out.println(i);
                }
            }
            System.out.println("Произвели сравнений остатка от деления:"+count);
            System.out.println("Чисел:"+nums);
        }

        public static boolean isPrime(int number){
            if (number <= 1)
                return false;
            if (number <= 3)
                return true;
            if ((number & 1) == 0 || number % 3 == 0) //(number & 1) == 0
                return false;
            for (int i = 5; Math.pow(i,2) <= number; i+=6) {
                count++;
                if (number % i == 0 || number % (i + 2) == 0)
                    return false;
            }
            return true;
        }
}
