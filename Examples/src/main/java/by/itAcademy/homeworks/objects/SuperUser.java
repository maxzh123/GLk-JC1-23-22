package by.itAcademy.homeworks.objects;

public class SuperUser extends User{

    private int суперсила=(int)(100*Math.random());
    public SuperUser(String имя, String фамилия, String отчество, int годРождения) {
        super(имя, фамилия, отчество, годРождения);
    }

    public int getСуперсила() {
        return суперсила;
    }

    @Override
    public String getИмя() {
        return "Супер ";//+super.getИмя()
    }


}
