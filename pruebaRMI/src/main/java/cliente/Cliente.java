/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import InterfaceRMI.RemoteInterface;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author PC
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, NotBoundException {
        
        Registry r = LocateRegistry.getRegistry("192.168.09.2", 3333);
        RemoteInterface i = (RemoteInterface) r.lookup("hola");
        i.hola();
    }
    
}
