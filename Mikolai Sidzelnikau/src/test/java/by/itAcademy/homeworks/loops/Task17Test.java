package by.itAcademy.homeworks.loops;

import java.util.Random;

class Task17Test {

    public static void main(String[] args) {
        Random random = new Random();
        int s = -2_000_231_001;
        int r = random.ints(1, 2147483647).findFirst().getAsInt();
        Task17 task17 = new Task17(s);
        Task17 task171 = new Task17(r);
        task17.getTask17();
        task171.getTask17();
        System.out.println(task17);
    }
}