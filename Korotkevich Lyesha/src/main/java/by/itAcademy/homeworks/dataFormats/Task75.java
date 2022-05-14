package by.itAcademy.homeworks.dataFormats;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
Напишите программу, которая будет разбирать xml файл, сделанный в задании 74 с помощью StAX,
 и выводить его на экран в текстовом виде.
 Каждая точка должна выводиться на отдельной строке в виде двух чисел, разделенных запятой,
 при этом должна выводиться единица измерения. Например: 10px, 30px.
*/
public class Task75 {
    public static void main(String[] args) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("Korotkevich Lyesha/src/main/resources/point.xml"));
            String result = "";
            while (reader.hasNext()){
                int res = reader.next();
                if(res == reader.START_ELEMENT){
                    switch (reader.getLocalName()) {
                        case "x":
                            result += reader.getText() + "px, ";
                            break;
                        case "y":
                            result += reader.getText() + "px\n";
                            break;
                    }
                }
            }
            System.out.println(result);
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
