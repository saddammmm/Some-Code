/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class fil {
    public static void main(String[] args) throws IOException
    { String s="saddam jjjjjj";
       int i;
		String[] text = new String[3];
		      Scanner sc=new Scanner(System.in);
                      for (int j = 0; j < 3; j++) {
            text[j]=sc.nextLine();
        }
		FileOutputStream fos = new FileOutputStream("theText.txt");
		PrintStream myOutput = new PrintStream(fos);
		for (i = 0; i < 3; i++) 
			myOutput.println(text[i]);
		
    }
}
