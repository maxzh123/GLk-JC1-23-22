package by.itAcademy.homeworks.oop;

import java.util.ArrayList;
import java.util.List;

public class Task33 {
    public static void main(String[] args) {
        long num=1_034_067_890_001L;

        List<NumberGroup> lst=new ArrayList<>();
        do{ long g=num%1000;
            num/=1000;
            if (num>0){
                lst.add(new Digits3(g));
            }else{
                lst.add(new Digits4(g));
            }
        }while(num>0);



        for (int i = lst.size()-1; i >=0 ; i--) {
                System.out.print(lst.get(i).getString());
            if (i>0){System.out.print(" ");}
        }
        System.out.println();
        AbstractNumberGroup t=new SuperNumberGroup();

        if (t instanceof МожетДатьВДыню){
            System.out.println("Не дерзить!");
        }


    }
}
