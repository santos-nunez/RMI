/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import InterfaceRMI.RemoteInterface;
import java.rmi.RemoteException;
import java.rmi.server.ServerNotActiveException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author PC
 */
public class Implementador extends UnicastRemoteObject implements RemoteInterface{

    public Implementador() throws RemoteException{
        super();
    }

    @Override
    public String hola() throws RemoteException {
        obtenerIP();
        return "hola a todos";
    }
    
    private void obtenerIP()throws UnsupportedOperationException{
        try {
            System.out.println(Implementador.getClientHost()+ " ... ");
            
        } catch (ServerNotActiveException e) {
        }
    }
    
    
}
