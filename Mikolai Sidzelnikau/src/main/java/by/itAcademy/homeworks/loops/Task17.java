package by.itAcademy.homeworks.loops;
import java.text.NumberFormat;
import java.util.Random;
/**## Задание 17
        > Задать произвольное целое число и вывести его в бухгалтерском формате, то
        > есть, начиная справа, каждые три позиции отделяются пробелом. Например, число
        > 20023143 должно быть выведено как 20 023 143.*/
public class Task17 {
    public static int numbers = 0;
    public static void main(String[] args) {
        Random random = new Random();
        numbers = random.ints(20000,20023143).findFirst().getAsInt();
        NumberFormat numberFormat = NumberFormat.getInstance();
        System.out.println(numberFormat.format(numbers));
    }
}
