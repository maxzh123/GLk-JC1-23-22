package by.itAcademy.homeworks.operators;

/**
 * ## Задание 6
 * > Создайте метод с одним целочисленным параметром. Метод должен
 * > определить, является ли последняя цифра числа семеркой и вернуть boolean
 * > значение.
 */
public class Task6 {
 public int numbers;

    public int getNumbers() {
        setNumbers(numbers);
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers % 10;
    }

    public boolean getaBoolean() {
        setNumbers(numbers);
        setaBoolean();
        return aBoolean;
    }

    public void setaBoolean() {
        this.aBoolean = numbers == 7;
    }

    public boolean aBoolean = true;
}
