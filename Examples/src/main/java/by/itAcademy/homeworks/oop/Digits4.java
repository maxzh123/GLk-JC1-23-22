package by.itAcademy.homeworks.oop;

public class Digits4 implements NumberGroup {
    private final long dig;

    public Digits4(long digGrp) {
        dig=digGrp;
    }

    @Override
    public String getString() {
        return Long.toString(dig);
    }
}
