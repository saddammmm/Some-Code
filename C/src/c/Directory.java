/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Directory {
    public static void main(String ars[]) throws IOException
    {
        File di=new File("direc");
        di.mkdir();
        File f=new File(di, "myFile.txt");
        f.createNewFile();
        String []a=new String[3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <3; i++) {
            a[i]=sc.nextLine();
                    
        }
        FileOutputStream fo=new FileOutputStream("myFile.txt");
        PrintStream pr=new PrintStream(fo);
        for (int i = 0; i <3; i++) {
            pr.println(a);
        }
    }
}
