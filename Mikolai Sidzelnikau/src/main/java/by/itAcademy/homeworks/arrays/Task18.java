package by.itAcademy.homeworks.arrays;

/**
 * ## Задание 18
 * > Создайте переменную для массива из 10 элементов. Заполните его
 * > произвольными значениями целочисленного типа и выведите последний элемент
 * > массива на экран.
 */
public class Task18 {
    public int[] array ={42,150,144,160,192,120,119,21,85,102};
    public int numberArray = 0;

    public int[] getArray() {
        setArray(array);
        return array;
    }

    public void setArray(int[] array) {
        if (array[0] == 0 ){
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i == array.length -1){
                numberArray = array[i];
            }
        }
        this.array = array;
    }
/* public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 200;
        for (int i = 0; i < array.length; i++) {
            array[i] = random(sum);
            if (i == array.length - 1){
                System.out.println(array[i]);
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static int random(int ran) {
        Random random = new Random();
        ran = random.ints(1, ran).findFirst().getAsInt();
        return ran;
    }*/
}
