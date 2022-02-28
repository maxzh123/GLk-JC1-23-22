package by.itAcademy.homeworks.operators;
/**Задать целое число в виде переменной, это число – сумма денег в рублях.
        > Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже
*/

public class Task8{
  public static void main(String[] args){
      int money=660;
      if(money%10==1){
          System.out.println(money+" рубль");
      }else if(money%10>1&&money%10<5){
          System.out.println(money+" рубля");
      }else{
          System.out.println(money+" рублей");
      }
  }
}
