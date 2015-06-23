/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.io.File;

/**
 *
 * @author shussain
 */
public class SearchingFile {
    public static void main(String []args)
    {
        String[]search=new String[100];
        File fse=new File("nbproject");
        search=fse.list();
        for (String string : search) {
            System.out.println("found "+string);
        }
    }
}
