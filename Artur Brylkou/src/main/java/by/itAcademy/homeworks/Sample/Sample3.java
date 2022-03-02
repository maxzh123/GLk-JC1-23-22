package by.itAcademy.homeworks.Sample;

public class Sample3 {
    public static void main(String[] args) {
        for(int a=0;a<20;a++){
            processNumber(a);
        }
    }
        private static void processNumber(int num){
            if (num%4 ==0){
                System.out.println(num+"Делиться на 4");
            }
                else{ System.out.println(num+ "Не делиться на 4");
        }
    }
}
