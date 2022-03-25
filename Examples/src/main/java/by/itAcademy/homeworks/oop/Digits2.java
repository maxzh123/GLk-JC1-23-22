package by.itAcademy.homeworks.oop;

public class Digits2 implements NumberGroup{
    private final long dig;

    public Digits2(long digGrp) {
        dig=digGrp;
    }

    @Override
    public String getString(){
        StringBuffer sb=new StringBuffer();
        int x=(int)Math.log10(dig);
        while (x<2){
            x++;
            sb.append("0");
        }
        sb.append(dig);
        return sb.toString();
    }

}
