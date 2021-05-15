/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author PC
 */
public interface RemoteInterface extends Remote {
    public String hola()throws RemoteException;   
}
