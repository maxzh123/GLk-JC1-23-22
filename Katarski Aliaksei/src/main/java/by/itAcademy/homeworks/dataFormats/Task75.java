package by.itAcademy.homeworks.dataFormats;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * > Напишите программу, которая будет разбирать xml файл, сделанный в задании
 * > 74 с помощью StAX, и выводить его на экран в текстовом виде. Каждая точка должна
 * > выводиться на отдельной строке в виде двух чисел, разделенных запятой, при этом
 * > должна выводиться единица измерения. Например: 10px, 30px.
 */

public class Task75 {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        XMLInputFactory factory = XMLInputFactory.newFactory();
        XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("Katarski Aliaksei/src/main/resources/forTask74"));
        List<Integer> lst =parse(reader);
        for(int i=0;i<lst.size();i+=2){
            Point point=new Point(lst.get(i), lst.get(i+1));
            System.out.println(point);
        }
//        System.out.println(lst);

    }


    public static List<Integer> parse(XMLStreamReader xmlRead) throws XMLStreamException {
        boolean isX = false;
        boolean isY = false;
        List<Integer> lst=new ArrayList<>();
        while (xmlRead.hasNext()) {
            int res = xmlRead.next();
            if (res == xmlRead.START_ELEMENT) {
                if (xmlRead.getLocalName().equals("x"))
                    isX = true;
                else if (xmlRead.getLocalName().equals("y"))
                    isY = true;
            } else if (res == xmlRead.CHARACTERS) {
                if (isX) {
                    lst.add(Integer.valueOf(xmlRead.getText()));
                    isX = false;
                } else if (isY) {
                    lst.add(Integer.valueOf(xmlRead.getText()));
                    isY = false;
                }
            }


        }
        return lst;
    }
}


