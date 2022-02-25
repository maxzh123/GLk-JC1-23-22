package by.itAcademy.homeworks.loops;

public class Task13 {
    /**
     * При помощи цикла dowhile вычислить произведение
     *
     *
     */

    public static void main(String[] args) {
        int i = 1; int result=1;
       do{           //объявление цикла
        result *=i;
        i++;
       }while (i<26); //Проверка условия на истинность
        System.out.println(result);
    }
}
