/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import com.sun.corba.se.impl.io.IIOPOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author shussain
 */
public class Seri_cal implements Serializable{
    public static void main(String[]args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        Seri_cal obj=new Seri_cal();
        FileOutputStream fr=new FileOutputStream("ooo.ser");
        ObjectOutputStream o=new ObjectOutputStream(fr);
        o.writeObject(obj);
        o.close();
        FileInputStream fi=new FileInputStream("ooo.ser");
        ObjectInputStream  i=new ObjectInputStream(fi);
        obj=(Seri_cal) i.readObject();
        i.close();
    }
    
}
