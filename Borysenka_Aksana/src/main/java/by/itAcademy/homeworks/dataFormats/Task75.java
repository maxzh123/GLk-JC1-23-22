package by.itAcademy.homeworks.dataFormats;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class Task75 {

    /**Task75
     * Напишите программу, которая будет разбирать xml файл, сделанный в задании 74 с помощью StAX,
     * и выводить его на экран в текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух чисел,
     * разделенных запятой, при этом должна выводиться единица измерения. Например: 10px, 30px.
     */

    public static void main(String[] args) throws XMLStreamException {

        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader reader = xmlInputFactory.createXMLEventReader(Task75.class.getClassLoader().getResourceAsStream("ForTask74/Task74.txt"));
        
        while(reader.hasNext()){
            XMLEvent nextEvent = reader.nextEvent();
            if(nextEvent.isStartElement()){
                StartElement startElement = nextEvent.asStartElement();
                if(!startElement.getName().getLocalPart().equals("x") && !startElement.getName().getLocalPart().equals("y")) {
                    System.out.println(startElement);
                }else if(startElement.getName().getLocalPart().equals("x")){
                    nextEvent = reader.nextEvent();
                    System.out.print("(" + nextEvent.asCharacters().getData() + "px,");
                }else if(startElement.getName().getLocalPart().equals("y")){
                    nextEvent = reader.nextEvent();
                    System.out.println(nextEvent.asCharacters().getData() + "py)");
                }
            }else if(nextEvent.isEndElement()){
                EndElement endElement = nextEvent.asEndElement();
                if(!endElement.getName().getLocalPart().equals("x") && !endElement.getName().getLocalPart().equals("y"))
                System.out.println(nextEvent);
            }
        }
    }
}
