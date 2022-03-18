package by.itAcademy.homeworks.operators;

/**Задать целое число в виде переменной, это число – сумма денег в рублях. Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже
 */
public class Task8 {
    public static void main(String[] args) {
        int a = 22;
        int b = 3;
        int sum = a + b;
        //если число заканчивается на 1, исключение 11
        if (sum % 10 == 1 && sum != 11) {
            System.out.println(sum + " рубль");
        }
        else
            //если число заканчивается на 2 или 3 или 4, исключение 12,13,14
            if (sum != 12 && sum != 13 && sum != 14 && (sum % 10 == 2 || sum % 10 == 3 || sum % 10 == 4)) {
                System.out.println(sum + " рубля");
            }
            //во всех остальных случаях
            else
                System.out.println(sum + " рублей");
    }
    }
