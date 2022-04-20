package by.itAcademy.homeworks.dataFormats;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.Arrays;

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
        private Point currentPoint;

        @Override
        public void startElement(String uri, String localName, String tagName, Attributes attributes) {

            if(tagName.equals("point")){
                if(currentPoint != null) {
                    System.out.println(currentPoint);
                    currentPoint=null;
                }
                currentPoint = new Point();
            }
            if (currentPoint!=null){
                currentPoint.takeStart(tagName);
            }else{
                System.out.println("Тэг проигнорирован:"+tagName);
            }
        }

        @Override
        public void characters(char[] ch, int start, int length){
            char[] val=Arrays.copyOfRange(ch,start,start+length);
            if(currentPoint != null) {
                currentPoint.setData(new String(val));
            }
        }

        @Override
        public void endElement(String uri, String localName, String tagName) {
            if(currentPoint != null) {
                currentPoint.takeEnd(tagName);
                if (currentPoint.isReady()){
                    System.out.println(currentPoint);
                    currentPoint=null;
                }
            }
        }
    }
}
