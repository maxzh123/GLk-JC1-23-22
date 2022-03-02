package by.itAcademy.homeworks.strings;

public class Task31 {
    static Runnable task = new Runnable() {
        public void run() {
            String temp = "";
            for (int i = 0; i < 100000; i++) {
                temp+="a";
            }
            System.out.println("String done it's task");
        }
    };
    static Runnable task2 = new Runnable() {
        public void run() {
            StringBuilder temp = new StringBuilder("");
            for (int i = 0; i < 100000; i++) {
                temp.append(String.valueOf(i));
            }
            temp.toString();
            System.out.println("StringBuilder done it's task");
        }
    };
    public static void main(String[] args) {
        Thread a = new Thread(task);
        Thread b = new Thread(task2);
        a.start(); b.start(); //Запускаем два паралельных потока для сравнения скорости работы String и StringBuilder

    }
}
