package com.codecool.cmd;

import com.codecool.cmd.Song;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XMLHandler {

    List<Song> cdlist = new ArrayList<>();

    public List<Song> readToObjects(){
        try {

            File fXmlFile = new File("src/main/data/data2.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("Card");

            for (int i = 0; i < nList.getLength(); i++) {

                Node nNode = nList.item(i);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    Song song = new Song(eElement.getAttribute("title"), Integer.valueOf(eElement.getAttribute("length")));
                    cdlist.add(song);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cdlist;
    }
}
