# Группа GLk-JC1-23-22
## Полезные ссылки:
1. [Тестилка регулярок](https://www.regextester.com/)
1. [Тестилка регулярок 2](http://regviz.org/)
1. [вопросы](https://github.com/enhorse/java-interview/blob/master/core.md)
1. [lightshot](https://app.prntscr.com/ru/) Программа для снятия скриншотов
1. [Far Manager](https://www.farmanager.com/download.php?l=ru)
1. [Winscp](https://winscp.net/eng/download.php)
1. [Total Commander](https://www.ghisler.com/download.htm)
1. [java](https://jdk.java.net/java-se-ri/11)
1. [maven](https://maven.apache.org/download.cgi)
1. [maven](https://maven.apache.org/download.cgi)
1. [Idea](https://www.jetbrains.com/ru-ru/idea/download/#section=windows)
1. [бобер](https://dbeaver.io/download/)
1. [putty](https://www.putty.org/) ssh клиент для подключения к linux серверам с машин с win 7 и младше
1. [Git](https://git-scm.com/) Клиент гит
1. [Tortoise Git](https://tortoisegit.org/) Клиент гит, который встраивается в Windows


## Задание 21.02.2022-24.02.2022:
1. Установить программу для снятия скриншотов. [лежит тут](https://app.prntscr.com/ru/) 
1. скачать и распаковать Java + Maven [java](https://jdk.java.net/java-se-ri/11) [maven](https://maven.apache.org/download.cgi)
   настроить переменные JAVA_HOME MAVEN_HOME
   изменить переменную Path.
1. убедится что корректно отрабатывают:
   java -version
   mvn -version
1. Установить среду разработки(Idea). Написать HelloWord. Прислать скриншот. [idea](https://www.jetbrains.com/ru-ru/idea/download/#section=windows)
1. Установить бобра (клиент для СУБД). Запустить. Прислать скриншот. [бобер](https://dbeaver.io/download/)
1. Убедится что есть ssh клиент `win+r` ->  `cmd` ->  `ssh`  Если не ругается, что команда не найдена - все ок. Если ругается качаем [putty](https://www.putty.org/) он понадобится потом. 
1. Зарегистрироваться на [GitHub](https://github.com)


### Обязательная программа закончена. начинается произвольная:
   
1. установить Git. убедится что он работает. команда: [лежит тут](https://git-scm.com/)
   `git -version`
1. Забрать репозиторий `win+r` ->  `cmd` -> `cd c:\` ->  `git clone https://github.com/maxzh123/GLk-JC1-23-22`
1. тем, кто без опыта программирования - постараться сделать задания 1-5 из "Задания для тех, кто хочет размять пальцы". (не получится не расстраивайтесь. Они закрывают примерно первые 3 занятия) Т.ем кто уже хоть как-то пишет - просмотреть их. не интересно? - пробуйте в 6-е.
1. доп. задание: написать программу, которая выведет все числа, цифры в которых не повторяются.

### Задания для тех, кто хочет размять пальцы:
Пакет `by.itAcademy.sample` в проекте "примеры"

```
/* Задание:
1. запустить убедится, что работает.
2. внести хоть какие-то изменения, которые меняют результат. и заставить это работать.
* */

public class Sample1 { //Сообщаем компилятору что Это класс и мы дали ему имя Sample1
    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
    * */
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
        System.out.println("Текст");  //Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
    }
}

```

```
/* Задание:
1. запустить убедится, что работает.
2. изменить количество повторений.
* */

public class Sample2 {//Сообщаем компилятору что Это класс и мы дали ему имя Sample2

    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
    * */
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
        for (int i=0;i<10;i++){//для цулочисленного i установить значение 0;выполнять блок пока i меньше 10; после каждого исполнения увеличить i на 1
            System.out.println("Повторение №"+i);//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
        }
    }

}
```

```
/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает
3. поменять функцию обработчик так, чтобы она выводила только числа которые делятся на 3
* */

public class Sample3 {   //Сообщаем компилятору что Это класс и мы дали ему имя Sample3

    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
    * */
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
        for (int i=0;i<10;i++){//для цулочисленного i установить значение 0;выполнять блок пока i меньше 10; после каждого исполнения увеличить i на 1
            processNumber(i);//Вызываем определенную ниже функцию processNumber. Передаем в качестве параметра значение i
        }
    }

    private static void processNumber(int num){ //определяем функцию не возвращающую результата и принимающую один целочисленный параметр
        if (num%2==0){ //если остаток от деления на 2 равен 0 то выполняем данный блок
            System.out.println(num+" четное");//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
        }else{//Это блок иначе, он выполняется если условие не верно
            System.out.println(num+" не четное");//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
        }
    }
}

```

```
/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает. (если не получится - не беда, этого я вам не обьяснял)
3. поменять функцию обработчик так, чтобы она выводила еще и информацию, о том делится ли значение i на 3
* */
public class Sample4 {//Сообщаем компилятору что Это класс и мы дали ему имя Sample4
    private static int[] array=new int[]{5,16,22,18,49,68,-3,12,21}; //определяем масив целых чисел с именем array и сразу наполняем его значениями.

    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
    * */
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
        for (int i=0;i<array.length;i++){//для цулочисленного i установить значение 0;выполнять блок пока i меньше чем длинна масива array; после каждого исполнения увеличить i на 1
            processNumber(array[i],i);//Вызываем определенную ниже функцию processNumber. Передаем в качестве параметра передаем значение из масива и его номер по порядку
        }
    }

    //определяем функцию не возвращающую результата и принимающую 2 целочисленных параметра
    private static void processNumber(int i,int index){
            System.out.println("Значение масива № "+index+ " равняется "+i);//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
    }

}
```

```
/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает.
3. Переделать так, чтобы выводились ВСЕ даты года(с учетом того что в разных месяцах разное количество дней)
* */
public class Sample5 {//Сообщаем компилятору что Это класс и мы дали ему имя Sample5

    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
    * */
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
            for (int i=1;i<=12;i++){//для цулочисленного i установить значение 0;выполнять блок пока i меньше либо равно 12; после каждого исполнения увеличить i на 1
                processNumber(i);//Вызываем определенную в другом месте функцию, для обработки значения i
            }
    }

    private static void processNumber(int month){//определяем функцию не возвращающую результата и принимающую один целочисленный параметр
        if (month>-1 && month<10){ //если переданное в функцию значение month больше чем -1 и одновременно мельше чем 10 то
            oneDigit(month); //Вызываем функци, которая выводит дату дописывая ведущий 0
        }else{//блок иначе
            if (month>-1 && month<100) {//проверяем что значение больше -1 и меньше 100
                twoDigit(month);//Вызываем функци, которая выводит дату
            }//блока иначе нет. эта ситуация будет проигнорирована. никаких действий не выполнится.
        }
    }

    private static void oneDigit(int dig){//определяем функцию не возвращающую результата и принимающую один целочисленный параметр
        System.out.println("01/0"+dig+"/2021");//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
    }

    private static void twoDigit(int dig){//определяем функцию не возвращающую результата и принимающую один целочисленный параметр
        System.out.println("01/"+dig+"/2021");//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
    }


}
```

```

/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает.
3. Челенж. Переделываем, так что количество вычислений остатка от деления было как можно меньше. Посмотрим у кого что получится.
* */
public class Sample6 {//Сообщаем компилятору что Это класс и мы дали ему имя Sample6
    private static int count=0;
    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
    * */
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
        for (int i=1;i<=1000;i++){//для целочисленного i установить значение 0;выполнять блок пока i меньше 100; после каждого исполнения увеличить i на 1
            if (isPrime(i)){// Вызываем функцию которая проверит является ли число простым если да - выводим его
                System.out.println(i);//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
            }//блока иначе нет. эта ситуация будет проигнорирована. никаких действий не выполнится.
        }
        System.out.println("Произвели сравнений остатка от деления:"+count);//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
    }

    private static boolean isPrime(int number){
        if (number==0 || number==1 || number==2){ //Если число которое нам передали одно из 0 1 2
            return true;//возвращаем да
        }else{//иначе
            for(int i=2;i<number;i++){//для целочисленного i установить значение 2;выполнять блок пока i меньше number; после каждого исполнения увеличить i на 1
                count++;
                if (number%i==0){//проверяем делится ли number на i. если делится нацело
                    return false;//возвращаем нет.
                }
            }
        }
        return true;//Если мы попали сюда -число точно простое.
    }


}
```#   g a m e z o 0 0  
 