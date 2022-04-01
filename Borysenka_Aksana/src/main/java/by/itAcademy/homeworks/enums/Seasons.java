package by.itAcademy.homeworks.enums;

public enum Seasons {
    WINTER(90), SPRING(92), SUMMER(92), AUTUMN(91);

    private int countOfDays;
    private String discription; //зачем его надо было создавать?

    Seasons(int countOfDays){
        this.countOfDays = countOfDays;
    }

    public int getCountOfDays() {
        return countOfDays;
    }


     public void nextMonth(Seasons seasons){
         switch (seasons){
             case AUTUMN:
                 System.out.println(WINTER);
                 break;
             case WINTER:
                 System.out.println(SPRING);
                 break;
             case SPRING:
                 System.out.println(SUMMER);
                 break;
             case SUMMER:
                 System.out.println(AUTUMN);
                 break;
         }
     }
}
