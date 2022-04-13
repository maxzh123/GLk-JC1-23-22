package by.itAcademy.homeworks.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;

/**## Задание 44
        > Написать собственное исключение от Exception. Сгенерировать код, который
        > будет выбрасывать его и обрабатывать. Результат работы программы вывести на
        > экран.*/
public class Task44 {
    final static Logger logger = LoggerFactory.getLogger(Task44.class);
    int[] sum = new int[5];
    public int[] getSum() {
        setSum(sum);
        return sum;
    }
    public void setSum(int[] sum)  {
        for (int i = 0; i < sum.length+1; i++) {
            sum[i] += 1;
        }
        this.sum = sum;
    }
    public static void main(String[] args) throws Exception  {
        Task44 task44 = new Task44();
        try {
            task44.getSum();
           throw new Exception();
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.error("ArrayIndexOutOfBoundsException");
            e = new ArrayIndexOutOfBoundsException();
        }
        logger.info(String.valueOf(task44));
    }

    @Override
    public String toString() {
        return "Task44{" +
                "sum=" + Arrays.toString(sum) +
                '}';
    }
}
