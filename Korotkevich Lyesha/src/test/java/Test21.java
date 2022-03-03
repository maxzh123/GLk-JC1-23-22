import by.itAcademy.homeworks.arrays.Task21;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test21 {
    @Test
    public void test1(){
        int array[] = new int[]{1, 3, 2, 6, 2, 3, 4, 5, 2, 3};
        Assertions.assertEquals(5, Task21.sum_between_max_min(array));
    }
    @Test
    public void test2(){
        int array[] = new int[]{6, 3, 2, 1, 2, 3, 4, 5, 2, 3};
        Assertions.assertEquals(5, Task21.sum_between_max_min(array));
    }
    @Test
    public void test3(){
        int array[] = new int[]{1, 1, 2, 6, 2, 3, 4, 5, 2, 3};
        Assertions.assertEquals(3, Task21.sum_between_max_min(array));
    }
    @Test
    public void test4(){
        int array[] = new int[]{6, 6, 6, 6, 2, 3, 4, 5, 2, 3};
        Assertions.assertEquals(8, Task21.sum_between_max_min(array));
    }
    @Test
    public void test5(){
        int array[] = new int[]{10, 3, 2, 6, 2, 10, 4, 5, 2, 3};
        Assertions.assertEquals(8, Task21.sum_between_max_min(array));
    }
    @Test
    public void test6(){
        int array[] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        Assertions.assertEquals(9, Task21.sum_between_max_min(array));
    }
    @Test
    public void test7(){
        int array[] = new int[]{67, 234234, 234,25235, 234, 234, 3444, 1, 5, 7};
        Assertions.assertEquals(29381, Task21.sum_between_max_min(array));
    }
}

