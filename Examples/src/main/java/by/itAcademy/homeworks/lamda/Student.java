package by.itAcademy.homeworks.lamda;

public class Student {
    private final String name;

    @Override
    public String toString() {
        return  name + ' ' + sname + ' '+ works + '/'+ works_ok ;
    }

    private final String sname;
    private final int works;
    private final int works_ok;

    public Student(String name, String sname, int works, int works_ok) {
        this.name = name;
        this.sname = sname;
        this.works = works;
        this.works_ok = works_ok;
    }
    public String getName() {
        return name;
    }

    public String getSname() {
        return sname;
    }

    public int getWorks() {
        return works;
    }

    public int getWorks_ok() {
        return works_ok;
    }
}
