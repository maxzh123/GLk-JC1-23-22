package by.itAcademy.homeworks.dataFormats;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**Напишите программу, которая будет разбирать xml файл:
 и выводит его на экран в текстовом виде.
 Каждая точка должна выводиться на отдельной строке в виде двух чисел, разделенных запятой,
 при этом должна выводиться единица измерения. Например: 10px, 30px.*/

public class Task74 {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document doc = null;
        String result = "";
        try{
            builder = factory.newDocumentBuilder();
        }catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        File f = new File("Korotkevich Lyesha/src/main/resources/point.xml");
        try{
            assert builder != null;
            doc = builder.parse(f);
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }
        assert doc != null;
        Element root = doc.getDocumentElement();
        NodeList points = root.getChildNodes();
        for(int i = 0; i < points.getLength(); i++) {
            if (points.item(i) instanceof Element) {
                NodeList coords = points.item(i).getChildNodes();
                for (int j = 0; j < coords.getLength(); j++) {
                    switch (coords.item(j).getNodeName()) {
                        case "x":
                            result += coords.item(j).getTextContent() + "px, ";
                            break;
                        case "y":
                            result += coords.item(j).getTextContent() + "px\n";
                            break;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
