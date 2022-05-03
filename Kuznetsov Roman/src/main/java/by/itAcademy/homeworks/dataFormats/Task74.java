package by.itAcademy.homeworks.dataFormats;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Task74 {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        File file = new File("C:\\Users\\Professional\\IdeaProjects\\GLk-JC1-23-22\\Kuznetsov Roman\\src\\main\\java\\by\\itAcademy\\homeworks\\dataFormats\\point.xml"); //Task74.class.getClassLoader().getResource("point.xml").getPath()
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);
        doc.getDocumentElement().normalize();
        System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
        NodeList nodeList = doc.getElementsByTagName("point");
        for (int itr = 0; itr < nodeList.getLength(); itr++)
        {
            Node node = nodeList.item(itr);
            if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                Element eElement = (Element) node;
                System.out.format("x= %s , y= %s", eElement.getElementsByTagName("x").item(0).getTextContent(), eElement.getElementsByTagName("y").item(0).getTextContent());
            }
        }
    }
}
