package by.itAcademy.homeworks.basics;

public class IsPrimeChallange {
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
            if (number==2 || number==3){ //Если число которое нам передали одно из 0 1 2
                return true;//возвращаем да
            }
            else{
                int temp = (number>10?9:number-1);
                for(int i=2;i<temp;i++){
                    count++;
                    if (number%i==0){
                        return false;
                    }
                }
            }
            return true;
        }
        //1 2 3 5 7 11 13 17 19
        // лучший результат 78022 || 2923 || 2914 || 2907
}
