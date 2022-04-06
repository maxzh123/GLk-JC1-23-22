package by.itAcademy.homeworks.oop.ForTask34;


import java.util.Scanner;

public class EmployeeOrg implements Employee {
    private String fullName;
    private String typeOfSalary;

    public EmployeeOrg(String fullName, String typeOfSalary) {
        this.fullName = fullName;
        this.typeOfSalary = typeOfSalary; //допусти будут вводить только hours, percent, mix
    }

    @Override
    public String fullName() {
        return this.fullName;
    }

    @Override
    public String typeOfSalary() {
        return this.typeOfSalary;
    }

    @Override
    public void working() {
        System.out.println("Я работал месяц, дайте мне зп");
    }

//    @Override
//    public int completedWorkInMonth() {
//        int implementationOfMonth = 0;
//        if (typeOfSalary == "hours"){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Введи количество отработанных часов");
//            implementationOfMonth = sc.nextInt();
//        }
//
//        if (typeOfSalary == "percent"){
//            Scanner sc1 = new Scanner(System.in);
//            System.out.println("Введи % выполнения задания");
//            implementationOfMonth = sc1.nextInt();
//        }
//
//        if (typeOfSalary == "mix"){
//            Scanner sc2 = new Scanner(System.in);
//            System.out.println("Введи % выполнения от плана");
//            implementationOfMonth = sc2.nextInt();
//        }
//        return implementationOfMonth;
//    }
}
