package by.itAcademy.homeworks.loops;

public class Task15 {
    public static void main(String[] args) {
       int simple = 0;
       int number = 0;
       for(int i =50; i<=70; i++){
           if (correct(i)){
               number++;
           } if(number == 2){
               simple = i;
               break;
           }
       }
        System.out.println("Second simple: " + simple);
    }
    public static boolean correct(int b){
        for(int i = 2; i<b; i++){
            if(b%i == 0){
                return false;
            }
         }return true;

    }
}