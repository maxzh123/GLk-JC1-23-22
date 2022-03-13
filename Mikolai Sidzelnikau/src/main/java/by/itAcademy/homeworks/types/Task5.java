package by.itAcademy.homeworks.types;

public class Task5 {
    public int sum = 3600;
    private int sec;
    private int m;
    private int min;

    public void getSum(int sum) {
        setSum(sum);
    }

    public void setSum(int sum) {
        getSec();
        getMin();
        getHour();
        this.sum = sum;
    }

    public int getSec() {
        setSec();
        return sec;
    }

    public void setSec() {
        this.sec = sum % 60;
    }

    public int getMin() {
        setMin();
        return min;
    }

    public void setMin() {
        getM();
        this.min = m % 60;
    }

    public int getHour() {
        setHour();
        return hour;
    }

    public void setHour() {
        getM();
        getMin();
        this.hour = (m - min) / 60;
    }

    public int hour;

    public void getM() {
        setM();
    }

    public void setM() {
        this.m = (sum - sec) / 60;
    }

}
