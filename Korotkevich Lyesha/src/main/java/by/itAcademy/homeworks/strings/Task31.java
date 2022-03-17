package by.itAcademy.homeworks.strings;

/**Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”,
один с помощью оператора сложения и String, а другой с помощью StringBuilder и метода append.
Сравните скорость их выполнения. Выведите сравнение на экран.*/

public class Task31 {
    public static void main(String[] args) {
        String str = "";
        long time1 = System.currentTimeMillis();
        System.out.print("Время выполнения с помощью StringBuilder:");
        str_builder();
        System.out.println(System.currentTimeMillis() - time1);
        long time = System.currentTimeMillis();
        System.out.print("Время выполнения конкатенаций:");//либо неправильно, либо очень долго
        conc(str);
        System.out.println(System.currentTimeMillis() - time);
    }

    public static void conc(String str){
        for (long i =1; i<= 1_000_000l;i++){
            str+="aaabbbccc";
        }
    }

    public static void str_builder(){
        StringBuilder str1 = new StringBuilder();
        for (long i =1; i<= 1_000_000l;i++){
            str1.append("aaabbbccc");
        }
        str1.toString();
    }
}
