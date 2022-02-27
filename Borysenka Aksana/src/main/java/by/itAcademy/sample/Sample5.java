package by.itAcademy.sample;

/** Задание:
1. запустить убедится, что работает.
2. разобраться как работает.
3. Переделать так, чтобы выводились ВСЕ даты года(с учетом того что в разных месяцах разное количество дней)
* */
public class Sample5 {//Сообщаем компилятору что Это класс и мы дали ему имя Sample5

    /** Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
     * */
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
        for (int i=1;i<=12;i++){//для цeлочисленного i установить значение 0;выполнять блок пока i меньше либо равно 12; после каждого исполнения увеличить i на 1
            processNumber(i);//Вызываем определенную в другом месте функцию, для обработки значения i
        }
    }

    private static void processNumber(int month){//определяем функцию не возвращающую результата и принимающую один целочисленный параметр
        int daysNumber;
        if (month>0 && month<10){ //если переданное в функцию значение month больше чем 0 и одновременно мельше чем 10 то
            daysNumber = getDaysNumber(month); //определям переменную в которой будет хранится последний день месяца;
            // вызываем функцию getDaysNumber(month), которая возвращает последний день месяца

            if (daysNumber == 0) {
                System.out.println("Error : Incorrect monthNumber"); //проверяем, что бы в переменную попадали корректные данные
            }
            oneDigit(month,daysNumber); //Вызываем функцию, которая выводит дату дописывая ведущий 0

        }else{//блок иначе
            if (month>9 && month<13) {//проверяем что значение больше 9 и меньше 13
                daysNumber = getDaysNumber(month);
                if (daysNumber == 0) {
                    System.out.println("Error : Incorrect monthNumber"); //проверяем, что бы в переменную попадали корректные данные
                }
                twoDigit(month, daysNumber);//Вызываем функцию, которая выводит дату
            }//блока иначе нет. эта ситуация будет проигнорирована. никаких действий не выполнится.
        }
    }

    private static int getDaysNumber(int monthNumber){ //определяем функцию, которая возвращает последний день месяца
        if (monthNumber == 2){
            return  28;
        }
        else if (monthNumber % 2 != 0 && monthNumber < 8) {
            return 31;
        }
        else if (monthNumber % 2 == 0 && monthNumber < 8) {
            return 30;
        }
        else if (monthNumber % 2 != 0 && monthNumber > 7) {
            return 30;
        }
        else if (monthNumber % 2 == 0 && monthNumber > 7) {
            return 31;
        }
        return 0;
    }

    private static void oneDigit(int dig, int last_day){//определяем функцию не возвращающую результата и принимающую один целочисленный параметр
        System.out.println("01/0"+dig+"/2022" + " - " + last_day + "/0" + dig + "/2022");//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
    }

    private static void twoDigit(int dig, int last_day){//определяем функцию не возвращающую результата и принимающую один целочисленный параметр
        System.out.println("01/"+dig+"/2022" + " - " + last_day + "/" + dig + "/2022");//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
    }

}
