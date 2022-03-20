package by.itAcademy.homeworks.loops;

/**
 * ## Задание 17
 * с помощью деления на 1000 откусывать по 3 разряда
 * > Задать произвольное целое число и вывести его в бухгалтерском формате, то
 * > есть, начиная справа, каждые три позиции отделяются пробелом. Например, число
 * > 20023143 должно быть выведено как 20 023 143.
 */

public class Task17 {

    public Task17(int numbers) {

        this.numbers = numbers;
    }

    public int getTask17() {
        if (numbers > 0) {
            getNumbers();
        } else {
            getNumbers2();
        }
        return numbers;
    }

    private int getNumbers() {
        setNumbers(numbers);
        return numbers;
    }

    private void setNumbers(int numbers) {
        while (numbers > 0) {
            sum = numbers % 1000;
            if ((int) Math.log10(sum) == 1) {
                prob = "0" + sum + " " + prob;
            } else if ((int) Math.log10(sum) == 0) {
                prob = "00" + sum + " " + prob;
            } else if ((int) Math.log10(sum) > 1) {
                prob = sum + " " + prob;
            } else {
                prob = "00" + sum + " " + prob;
            }
            numbers /= 1000;
        }
        if (sum < 10) {
            accountant = prob.substring(2);
            System.out.println(accountant);
        } else if (sum <= 99) {
            accountant = prob.substring(1);
            System.out.println(accountant);
        } else {
            System.out.println(prob);
        }
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Task17{" +
                "sum=" + sum +
                ", numbers=" + numbers +
                ", numbers2=" + numbers2 +
                ", prob='" + prob + '\'' +
                ", accountant='" + accountant + '\'' +
                '}';
    }

    private int getNumbers2() {
        setNumbers2(numbers);
        return numbers2;
    }

    private void setNumbers2(int numbers2) {
        while (numbers2 < 0) {
            numbers2 = -numbers2;
            System.out.print("-");
            setNumbers(numbers2);
        }
        this.numbers2 = numbers2;
    }

    private int sum;
    private int numbers;
    private int numbers2;
    private String prob = "";
    private String accountant;
}
