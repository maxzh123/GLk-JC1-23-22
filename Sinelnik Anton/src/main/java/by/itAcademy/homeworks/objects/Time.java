package by.itAcademy.homeworks.objects;

public class Time {
    private int seconds;
    private int minutes;
    private  int hours;


    public Time(int totalSeconds){
        hours = totalSeconds/3600;
        minutes = (totalSeconds%3600)/60;
        seconds = totalSeconds%60;
    }

    public Time(int seconds, int minutes, int hours){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }


    public int getAllSeconds (){
        return hours*3600 + minutes*60 + seconds;
    }

      public int compareTo(Time anotherTime) {
        return ((getAllSeconds()< anotherTime.getAllSeconds())?-1: (getAllSeconds() == anotherTime.getAllSeconds()) ? 0:1);

    }

}
