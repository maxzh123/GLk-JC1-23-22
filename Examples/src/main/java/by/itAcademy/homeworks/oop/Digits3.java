package by.itAcademy.homeworks.oop;

public class Digits3 implements NumberGroup{
    private final long dig;

    public Digits3(long digGrp) {
        dig=digGrp;
    }

    @Override
    public String getString() {
        StringBuffer sb=new StringBuffer();
        if (dig<100){
            sb.append("0");
        }
        if (dig<10){
            sb.append("0");
        }
        sb.append(dig);
        return sb.toString();
    }

}
