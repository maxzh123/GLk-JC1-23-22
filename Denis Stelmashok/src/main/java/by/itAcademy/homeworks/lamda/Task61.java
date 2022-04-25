package by.itAcademy.homeworks.lamda;

public class Task61 {
    static int count=0;

    public int getNum() {
        return num;
    }

    private final int num= ++count;


    NumProvider createMyClass(){
        class MyClass implements NumProvider{
            @Override
            public int getNum() {
                return Task61.this.num;
            }
        }
        return new MyClass();
    }

}
