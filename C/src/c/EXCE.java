/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class EXCE {
    public static void main(String[] args)
    {
        doM();
    }
    public static void doM()
    { Scanner sc=new Scanner(System.in);
    int x;
         x=sc.nextInt();
        doMoreStuff(x);
    }
    public static void doMoreStuff(int x)
    { int y=9;
        //getRootCauseMessage(Throwable th);
        System.out.println(y/x);
    }
}
