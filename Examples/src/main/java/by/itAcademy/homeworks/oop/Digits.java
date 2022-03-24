package by.itAcademy.homeworks.oop;

public class Digits implements NumberGroup{
    private final long dig;

    public Digits(long digGrp) {
        dig=digGrp;
    }

    @Override
    public String getString() {
        String res=Long.toString(dig);
        while(res.length()<3){
            res="0"+res;
        }
        return res;
    }
}
