package by.itAcademy.homeworks.basics;

public class IsPrimeChallange {
        private static int count=0;
    private static int nums=0;
        public static void main (String[] arg){
            for (int i=1;i<=1000;i++){
                if (isPrime(i)){
                    nums++;
                    System.out.println(i);
                }
            }
            System.out.println("Произвели сравнений остатка от деления:"+count);
            System.out.println("Чисел:"+nums);//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
        }

        private static boolean isPrime(int number){
            if (number==2 || number==3){
                return true;
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
}
