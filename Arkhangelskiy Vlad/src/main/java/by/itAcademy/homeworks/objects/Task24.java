package by.itAcademy.homeworks.objects;

/**
 * Создать класс, описывающий промежуток времени. Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
 * Сделать методы для получения полного количества секунд в объекте,
 * сравнения двух объектов (метод должен работать аналогично compareTo в строках).
 * Создать два конструктора:
 *
 * получающий общее количество секунд
 * получающий часы, минуты и секунды по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.
 */

public class Task24 {

    public static class Time {

        private final int seconds;
        private final int minutes;
        private final int hours;

        public Time(int seconds) {
            this.hours = seconds / 3600;
            this.minutes = (seconds % 3600) / 60;
            this.seconds = (seconds % 3600) % 60;
        }

        public Time(int seconds, int minutes, int hours) {
            this.seconds = seconds;
            this.minutes = minutes;
            this.hours = hours;
        }

        public int getSeconds() {
            return seconds + (minutes * 60) + (hours * 3600);
        }

        public boolean isEquals(Time time) {
            return getSeconds() == time.getSeconds();
        }

        @Override
        public String toString() {
            return "Time{" +
                    "seconds=" + seconds +
                    ", minutes=" + minutes +
                    ", hours=" + hours +
                    '}';
        }
    }

    public static void main(String[] args) {
        Time time1 = new Time(3661);
        Time time2 = new Time(3661);

        System.out.println(time1.isEquals(time2));
    }


}
