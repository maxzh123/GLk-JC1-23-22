package by.itAcademy.homeworks.strings;

/**
 * Написать 2 цикла в которых выполнить по миллиону сложений строк.Один цикл с + и String,второй с помощью String Builder
 * и append.Сравнить скорость выполнения.
 */

public class Task31 {
    public static void main(String[] args) {
        String str = "abcdabcd";
        builderTimerTest(str);
        concatTimerTest(str);
    }

    public static void strBuild(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i <= 1000000; i++) {
            stringBuilder.append("abc");
        }
    }
    //Конкатинация работает нереально долго.Уменьшил кол-во повторений в цикле.
    public static void strConcat(String str){
        for(int i=0;i<=10000;i++){
            str+="abc";
        }
    }
    public static void builderTimerTest(String str){
        long builderStart=System.currentTimeMillis();
        strBuild(str);
        long builderFinish=System.currentTimeMillis();
        long totalBuilderTime=builderFinish-builderStart;
        System.out.println("String builder занял времени: "+totalBuilderTime+" мс");
    }
    public static void concatTimerTest(String str){
        long concatStart=System.currentTimeMillis();
        strConcat(str);
        long concatFinish=System.currentTimeMillis();
        long totalTimeConcatination=concatFinish-concatStart;
        System.out.print("Concatination заняло : "+totalTimeConcatination+" мс");
    }
}