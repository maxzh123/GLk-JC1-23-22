package by.itAcademy.homeworks.objects;

public class User implements Comparable<User>{

    private final String имя;
    private String фамилия;
    private String отчество;
    private int годРождения;
    private boolean[] привелегии;
    static{
        System.out.println("Инициализатор ");
    }
    public User(String имя, String фамилия, String отчество, int годРождения) {
        this.имя = имя;
        this.фамилия = фамилия;
        this.отчество = отчество;
        this.годРождения = годРождения;
        System.out.println("конструктор "+имя);
    }

    @Override
    public String toString() {
        return "User{" +
                "имя='" + getИмя() + '\'' +
                ", фамилия='" + фамилия + '\'' +
                ", отчество='" + отчество + '\'' +
                ", годРождения=" + годРождения +
                '}';

    }



    public String getИмя() {
        return имя;
    }
//    public void setИмя( String имя) {
//        this.имя=имя;
//    }

    public String getФамилия() {
        return фамилия;
    }

    public String getОтчество() {
        return отчество;
    }

    public int getГодРождения() {
        return годРождения;
    }

    public boolean[] getПривелегии() {
        return привелегии;
    }


    static User getInstance(){
        return new User("Имя","Фамилия","Отчество",1900);
    }

    @Override
    public int compareTo(User o) {
        int res=this.фамилия.compareTo(o.фамилия);
        if(res==0){res=this.имя.compareTo(o.имя);}
        return res;
    }
}
