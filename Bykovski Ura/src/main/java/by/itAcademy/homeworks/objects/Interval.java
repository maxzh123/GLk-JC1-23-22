package by.itAcademy.homeworks.objects;

public class Interval implements Comparable<Interval>{
    private int seconds;
    private int minutes;
    private int hours;

    public Interval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int only_seconds(){
        return hours*3600+minutes*60+seconds;
    }
    public void Normal_time(){
        this.hours=only_seconds()/3600;
        this.minutes=(only_seconds()-hours*3600)/60;
        this.seconds=only_seconds()-hours*3600-minutes*60;
    }
    public int getHours(){return this.hours;}
    public int getMinutes(){return this.minutes;}
    public int getSeconds(){return this.seconds;}

    @Override
    public int compareTo(Interval i){
        return seconds > i.seconds ? 1 : seconds < i.seconds ? -1 : 0;
    }
    public void print(){
        System.out.println("hours "+hours+" minutes "+minutes+" seconds "+seconds);
    }
}
