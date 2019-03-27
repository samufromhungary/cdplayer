package com.codecool.cmd.client;

import com.codecool.cmd.rmiInterface.RMIInterface;

import javax.swing.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

    public Client(){

    }

    private static RMIInterface look_up;

    public static void main(String[] args)
        throws MalformedURLException, RemoteException, NotBoundException {

        look_up = (RMIInterface) Naming.lookup("//localhost/MyServer");

        String response = look_up.getTrackList();
        System.out.println(response);
    }
}
