package by.itAcademy.homeworks.loops;
/**Вычислить факториал целых чисел от 0 до 10 с помощью цикла while
*/

public class Task12 {
    public static void main(String[] args){
        int firstLoop=0;
        int i=0;
        while(i<=10){
            if(firstLoop<=0){
                firstLoop++;
            }
            firstLoop*=i;
            i++;
            System.out.println(firstLoop);
        }
    }
}
//Не знаю как избежать костыля с If.