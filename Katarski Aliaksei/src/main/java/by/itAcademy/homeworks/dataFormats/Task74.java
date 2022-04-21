package by.itAcademy.homeworks.dataFormats;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * > Напишите программу, которая будет разбирать xml файл:
 * ```
 * 	<pointsList>
 * 	<point>
 * 	 <x>2</x>
 * 	 <y>3</y>
 * 	</point>
 * 	<point>
 * 	 <x>9</x>
 * 	 <y>3</y>
 * 	</point>
 * 	</pointsList>
 */

public class Task74 {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File file = new File("Katarski Aliaksei/src/main/resources/forTask74");
        List<Integer> parsedFile =parse(file);
        Point point;
        try {
           parse(file);
        } catch (Exception e) {
            System.out.printf("Parse error");
            return;
        }
        for(int i=0;i<parsedFile.size();i+=2){
            point=new Point(parsedFile.get(i), parsedFile.get(i+1));
            System.out.println(point);
        }
    }
    public static List<Integer> parse(File file) throws ParserConfigurationException, IOException, SAXException {
        List<Integer> lst = new ArrayList<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document doc = factory.newDocumentBuilder().parse(file);
        Element root = doc.getDocumentElement();
        NodeList nList = root.getChildNodes();
        for (int i = 0; i < nList.getLength(); i++) {
            if (nList.item(i).getNodeType()!=Node.ELEMENT_NODE) continue;
                NodeList list = nList.item(i).getChildNodes();
                for (int j = 0; j < list.getLength(); j++) {
                    if (list.item(j).getNodeType()!=Node.ELEMENT_NODE) continue;
                        lst.add(Integer.valueOf(list.item(j).getTextContent()));
                    }
                }
        return lst;
    }

        }




