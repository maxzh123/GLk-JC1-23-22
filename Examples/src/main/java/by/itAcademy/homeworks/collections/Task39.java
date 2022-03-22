package by.itAcademy.homeworks.collections;


import java.util.*;

public class Task39 {
    public static void main(String[] args) {
        Map<String,String> m= new HashMap<>();
        m.put("0368 EX3","Старое корыто которое я таки продал");
        m.put("0000 EX3","Я не знаю номер, того что куплю");
        m.put("0300 90[r'dop EX3",null);
        Iterator<Map.Entry<String, String>>
                es=m.entrySet().iterator();
        while(es.hasNext()){
            Map.Entry<String, String> val=es.next();
            System.out.println(val.getKey());
            System.out.println(val.getValue());
            System.out.println("");
        }

        MyClass<Integer> a=new MyClass<>();
        MyClass<String> b=new MyClass<>();
        a.setValue(5);
        int i=a.getValue();
        b.setValue("");

        List<String> lst=new ArrayList<>();
        lst.sort((o1,o2)->0);

    }
}
