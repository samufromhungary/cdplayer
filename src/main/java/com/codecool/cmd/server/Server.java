package com.codecool.cmd.server;

import com.codecool.cmd.Song;
import com.codecool.cmd.rmiInterface.RMIInterface;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;


public class Server extends UnicastRemoteObject implements RMIInterface {

    private static final long serialVersionUID = 1L;


    public Server() throws RemoteException {
        super();
    }

    @Override
    public String getTrackList() throws RemoteException{
        List<Song>  spotiftyTrackList = new ArrayList<>();
        String answer = "";
        try {
            File path = new File("src/main/data/data.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(path);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("song");

            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    Song song = new Song(eElement.getAttribute("title"), Integer.valueOf(eElement.getAttribute("lenght")));
                    spotiftyTrackList.add(song);
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }

        for (Song song: spotiftyTrackList) {
            answer += song.getTitle() + "\n";
        }
        return answer;
    }

    public static void main(String[] args) {

        try {

            Naming.rebind("//localhost/MyServer", new Server());
            System.err.println("Server ready");

        } catch (Exception e) {

            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();

        }
    }
}
