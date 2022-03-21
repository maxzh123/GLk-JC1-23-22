package by.itAcademy.homeworks.objects;

import org.jetbrains.annotations.NotNull;

public class TimeInterval implements Comparable<TimeInterval>{
    public int seconds;
    public int minutes;
    public int hours;

    public TimeInterval(int hours, int minutes, int seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public TimeInterval(int seconds) {
        this.seconds = seconds % 60;
        minutes = ((seconds - this.seconds)/60) % 60;
        hours = (seconds - minutes * 60) / 3600;
    }

    public int getAllSeconds(){
        return seconds + minutes * 60 + hours * 3600;
    }

    public String showTime(){
        String text = "";
        return text = String.format("%02d" + " часов: " +"%02d" + " минут: " + "%02d" + " секунд: " + getAllSeconds() + "секунд",
                hours,minutes,seconds);
    }

    @Override
    public int compareTo(@NotNull TimeInterval timeInterval){
        Integer a = getAllSeconds();
        return a.compareTo(timeInterval.getAllSeconds());
    }
}
