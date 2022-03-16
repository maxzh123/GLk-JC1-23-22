package by.itAcademy.homeworks.objects.task24;

import org.jetbrains.annotations.NotNull;

public class TimeInterval implements Comparable<TimeInterval>{
    public int seconds,minutes,hours;

    public TimeInterval(int seconds,int minutes,int hours){
        this.seconds=seconds;
        this.minutes=minutes;
        this.hours=hours;
    }

    public int getSeconds() {
        return seconds+(minutes*60)+(hours*3600);
    }

    @Override
    public int compareTo(@NotNull TimeInterval o) {
        if (this.getSeconds()>o.getSeconds()){
            return this.getSeconds();
        } else return o.getSeconds();
    }

    }
