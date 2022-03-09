package by.itAcademy.homeworks.exceptions;

public class Task45 {
    public static void main(String[] args) {
        int[] temp = new int[10];
        try {
            for (int i = 0; i < 11; i++) {
                temp[i] = 1;
            }
        }catch (Exception e){   //Обработка на много уровней выше, но все же
            e.printStackTrace();
        }
        System.out.println("1");
    }
}
