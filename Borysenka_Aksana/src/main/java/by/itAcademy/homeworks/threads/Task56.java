package by.itAcademy.homeworks.threads;

class SayA{
    synchronized void saying(DontSay ds){
        System.out.println(Thread.currentThread().getName() + "AAAAA");
        try {
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Class aborted");
        }
        System.out.println("Здесь поток пытается вызвать метод DontSay.empty()");
        ds.empty();
    }
    synchronized void empty(){
        System.out.println("пам-пам=)");
    }
}

class DontSay{
    synchronized void silence(SayA a){
        System.out.println(Thread.currentThread().getName() + "AAAAA");
        try {
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Class aborted");
        }
        System.out.println("Здесь поток пытается вызвать метод SayA.empty()");
        a.empty();
    }
    synchronized void empty(){
        System.out.println("ничего не хочется говорить(");
    }
}

class DeadLock implements Runnable{
    SayA a = new SayA();
    DontSay d = new DontSay();

    @Override
    public void run() {
        a.saying(d); //получаем блокировку для объекта а
        d.silence(a);
    }
}


public class Task56 {

    /**Task56
     * Создать программу, которая реализует deadlock между тремя потоками.
     */
    public static void main(String[] args) {

        DeadLock dl = new DeadLock();
        Thread first = new Thread(dl, "Scream of the soul ");
        Thread second = new Thread(dl, "Just ");
        first.start();
        second.start();
    }
}
