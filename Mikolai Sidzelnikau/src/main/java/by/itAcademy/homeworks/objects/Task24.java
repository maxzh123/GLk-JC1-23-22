package by.itAcademy.homeworks.objects;
/**## Задание 24
        > Создать класс, описывающий промежуток времени. Сам промежуток в классе
        > должен задаваться тремя свойствами: секундами, минутами, часами. Сделать
        > методы для получения полного количества секунд в объекте, сравнения двух
        > объектов (метод должен работать аналогично compareTo в строках). Создать два
        > конструктора:
        > - получающий общее количество секунд
        > - получающий часы, минуты и секунды по отдельности.
        > Сделать метод для вывода данных. Прочее на ваше усмотрение.*/
public class Task24 implements Comparable<Task24>{
   private int sec;
   private int min;
   private int hour;

    public Task24(int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public Task24(int totalSec){
        this.sec = (totalSec%3600)%60;
        this.min = (totalSec%3600)/60;
        this.hour = totalSec/3600;
    }

    public int getSec() {
        setSec();
        return sec;
    }

    public void setSec() {
        hour *= 60;
        min += hour;
        min *= 60;
        sec += min;
    }

    @Override
    public String toString() {
        return "Task24{" +
                "sec=" + sec +
                ", min=" + min +
                ", hour=" + hour +
                '}';
    }

    @Override
    public int compareTo(Task24 o) {
        int left = getSec();
        int right = o.getSec();
        return Integer.compare(left, right);
    }
}
