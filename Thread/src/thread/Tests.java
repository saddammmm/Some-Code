/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import com.sun.jmx.snmp.tasks.Task;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shussain
 */
public class Tests{
    
    public static void main(String []args) throws InterruptedException
    {
     
         
        int [][]R={{60 ,40, 30, 20 ,70},
                      {400 ,350, 200, 450, 100},
                      {50, 40, 55, 70 ,60},
                      { 0, 3 ,2 ,1, 4},
                      { 0 ,0 ,0 ,0 ,0}};
        for (int i = 0; i <5; i++) {
            R[4][i]=8;
        }
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <5; j++) {
                System.out.print(R[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
