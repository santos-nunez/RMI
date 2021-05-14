package examples.hello;

import java.applet.Applet;
import java.awt.Graphics;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class HelloApplet extends Applet { 

    String message = "blank"; 
         
    // "obj" es el identificador que utilizaremos para
    // referirnos al objeto remoto que implementa la interfaz
    // "Hello" 
    Hello obj = null; 

    public void init() { 
        try { 
            obj = (Hello)Naming.lookup("//127.0.0.1:1500/HelloServer"); 
            message = obj.sayHello(); 
        } catch (Exception e) { 
            System.out.println("HelloApplet exception: " + e.getMessage()); 
            e.printStackTrace(); 
        } 
    } 

    public void paint(Graphics g) { 
        g.drawString(message, 25, 50); 
    } 
}

