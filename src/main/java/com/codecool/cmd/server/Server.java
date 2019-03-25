package com.codecool.cmd.server;

import com.codecool.cmd.rmiInterface.RMIInterface;

import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;


public class Server extends UnicastRemoteObject implements RMIInterface {

    private static final long serialVersionUID = 1L;


    public Server() throws RemoteException {
        super();
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
