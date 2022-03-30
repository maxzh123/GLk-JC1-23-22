package by.itAcademy.homeworks.objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task24Test {
    @Test
    void test1(){
        Task24 task24 = new Task24(20,20,2);
        Task24 task241 = new Task24(8420);
        Assertions.assertEquals(0,task24.compareTo(task241));
    }
    @Test
    void test2(){
        Task24 task24 = new Task24(20,20,2);
        Task24 task241 = new Task24(8418);
        Assertions.assertEquals(1,task24.compareTo(task241));
    }
    @Test
    void test3(){
        Task24 task24 = new Task24(20,20,2);
        Task24 task241 = new Task24(8421);
        Assertions.assertEquals(-1,task24.compareTo(task241));
    }
    @Test
    public void comparisonSec() {
       Task24 task24 = new Task24(20,20,2);
       Task24 task241 = new Task24(8420);
        System.out.println(task24);
        System.out.println(task241);
        int result = task24.compareTo(task241);
        if (result == 0){
            System.out.println("Время одинаковое");
        }else if (result < 0){
            System.out.println("Второе время больше");
        }else {
            System.out.println("Первое время больше");
        }
    }
}