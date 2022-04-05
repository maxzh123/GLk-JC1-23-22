package jul.example;

import jul.example.anotherPackage.Inner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * http://logback.qos.ch/manual/configuration.html
* */
public class Runner {

    final static Logger logger = LoggerFactory.getLogger(Runner.class);


    public static void main(String... args){
        Inner i=new Inner();
        logger.info("Мы начали");
        for (int j = 0; j < 10000 ; j++) {
            i.doSomeStuff(j);
            i.dummyWork();
        }
        logger.info("Мы кончили");
    }

}
