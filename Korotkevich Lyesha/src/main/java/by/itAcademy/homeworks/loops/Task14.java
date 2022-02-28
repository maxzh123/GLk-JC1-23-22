package by.itAcademy.homeworks.loops;

public class Task14 {
    public static void main(String[] args){
        System.out.println(digitalsum(7893823445L));
    }
    public static long digitalsum(long num){
        long sum = 0;
        while(num > 10){
            sum += num %10;
            num /= 10;
        }
        return (sum+num);
    }
}
