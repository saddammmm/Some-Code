/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author shussain
 */
public class     Directory3 {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        File exits=new File("C:\\Users\\shussain\\Documents\\NetBeansProjects\\C\\src\\c");
        System.out.println(exits.isDirectory());
        File asi=new File(exits, "Directory3.java");
        FileReader fr=new FileReader(asi);
        BufferedReader br=new BufferedReader(fr);
        String s;
        
        while((s=br.readLine())!=null)
        {
            System.out.println(s);
            
        }
      br.close();
    }
    
}
