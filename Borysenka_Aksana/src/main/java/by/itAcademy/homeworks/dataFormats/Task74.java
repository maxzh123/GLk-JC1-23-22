package by.itAcademy.homeworks.dataFormats;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class Task74 {

    /**
     * Task74
     * Напишите программу, которая будет разбирать xml файл:
     * <pointsList>
     * <point>
     * <x>2</x>
     * <y>3</y>
     * </point>
     * <point>
     * <x>9</x>
     * <y>3</y>
     * </point>
     * </pointsList>
     * и выводит его на экран в текстовом виде.
     * Каждая точка должна выводиться на отдельной строке в виде двух чисел, разделенных запятой,
     * при этом должна выводиться единица измерения. Например: 10px, 30px.
     */


    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        try {
            SAXParserFactory sf = SAXParserFactory.newInstance();
            SAXParser sp = sf.newSAXParser();
            XMLHandler h = new XMLHandler();
            sp.parse(Task74.class.getClassLoader().getResourceAsStream("ForTask74/Task74.txt"), h);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static class XMLHandler extends DefaultHandler {
        boolean x = false;
        boolean y = false;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) {
            if (qName.equals("point")) {
                System.out.println("<"+qName+">");
            } else if(qName.equals("x")){
                x = true;
            } else if(qName.equals("y")) {
                y = true;
            } else {
                System.out.println("<" + qName + ">");
            }
        }

        @Override
        public void characters(char[] ch, int start, int length){
            StringBuffer sb = new StringBuffer();
            if(x) {
                sb.append("(" + new String(ch, start, length));
                x = false;
                sb.append(("px,"));
            } else if(y){
                sb.append(new String(ch, start, length));
                y = false;
                sb.append(("py)" + "\n"));
            }
            System.out.print(sb);
        }

        @Override
        public void endElement(String uri, String localName, String qName) {
            if(!qName.equals("x") && (!qName.equals("y"))) {
                System.out.println("</" + qName + ">");
            }
        }
    }
}
