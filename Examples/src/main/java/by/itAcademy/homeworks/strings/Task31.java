package by.itAcademy.homeworks.strings;

public class Task31 {
    public static void main(String[] args) {
        String a="abc";
        String b=new String("ABC");
        b=b.intern();
        System.out.println(a.equalsIgnoreCase(b));
    }
}
