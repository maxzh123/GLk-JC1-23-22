package by.itAcademy.homeworks.lamda;

public class Task62 {
    public static void main(String[] args) {
        Task61 t1=new Task61();
        Task61 t2=new Task61();
        NumProvider n1=t1.createMyClass();
        NumProvider n2=t1.createMyClass();
        NumProvider n3=t2.createMyClass();
        System.out.println(n1.getNum());
        System.out.println(n2.getNum());
        System.out.println(n3.getNum());
        System.out.println(n1==n2);
    }
}
