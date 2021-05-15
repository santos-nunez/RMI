/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author PC
 */
public class Servidor {

    public Servidor() {
        try {
            Registry registro = LocateRegistry.createRegistry(3333);
            registro.rebind("hola", new Implementador());
            System.out.println("Server On");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws RemoteException, NotBoundException {
       new Servidor();
    }

}
