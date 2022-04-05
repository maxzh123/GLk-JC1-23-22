package by.itAcademy.homeworks.oop.ForTask34;

import java.util.Scanner;

public class ChiefAccountant implements Accountant{

    private int revenueForMonth;
    private Employee x;

    private final  int NORMA_HOUR = 25;
    private final int NORMA_PERCENT = 100;
    private final int TARIF_OF_MONTH = 350;
    private final int PLAN_OF_MONTH = 1000;


    public ChiefAccountant(int revenueForMonth) {
        this.revenueForMonth = revenueForMonth;
    }

    //особо не разбираюсь, как правильно начисляется зп

    @Override
    public void calculate(Employee x) {
        int salary = 0;
        if (x.typeOfSalary() == "hours"){  // copmareTo
            Scanner sc = new Scanner(System.in);
            System.out.println("Введи количество отработанных часов");
            salary = sc.nextInt() *  NORMA_HOUR;
        }


        if (x.typeOfSalary() == "percent"){  // copmareTo
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Введи % выполнения задания");
            salary = (sc1.nextInt()/100) * PLAN_OF_MONTH;
        }

        if (x.typeOfSalary() == "mix"){  // copmareTo
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Введи % выполнения от плана");
            salary = (sc2.nextInt()/100) * revenueForMonth + TARIF_OF_MONTH;
        }

        System.out.println("Сотруднику " + x.fullName() + " начислено: " + salary);
    }

}
